# 4장 예외

### 4.1.2 예외의 종류와 특징
* Error
```text
 첫째는 java.lang.Error 클래스의 서브클래스들이다.
 자바 VM에서 발생시키므로 애플리케이션 코드에서 잡으려고 하면 안 된다.
```
* Exception과 체크 예외
  * check 예외
  ```text
    Exception 클래스의 서브클래스이면서 RuntimeException 클래스를 상 속하지 않은 것 들이다.
  ```
  * unchecked 예외
  ```text
  RuntimeException을 상속한 클래스를 말한다.
  RuntimeException과 그 서브클래스는 특별하게 다룬다.
  명시적인 예외처리를 강제하지 않기 때문에 언체크 예외라고 불린다.
  catch문으로 잡거나 throws로 선언하지 않아도 된다.
  최근에 새로 등장히는 자바 표준 스펙의 API들은 예상 기능한 예외상횡을 다루는 예외를 체크 예외로 만들지 않는 경향이 있기도 하다.
  ```
### 4.1.3 예외처리 방법
#### 예외 복구
```text
int maxretry = 10; 
while(maxretry-- > 20){
            try{
            return;// 작업 성공
            }
            catch(SomeException e) {
              // 예외가 발생활 가능성이 있는 시도 
              // 로그 출력. 정해진 시간만큼 대기
            }
            finally{
            //리소스반납. 정리작업
            }
}
throw new RetryFailedException(); // 최대 재시도 횟수를 넘기면 직접 예외 발생
```
#### 예외처리 회피
```text
public void add() throws SQLException { 
  try {
  // JDBC API
  catch(SQLException e) { // 로그 출력
  throw e;
  }
}
```
#### 예외 전환
예외 전환 기능을 가진 DAO메소드
```text
public void add(User user) throws DuplicateUserldException, SQLException { 
  try {
    // JDBC를 이용해 user 정보를 DB에 추가하는 코드 또는
    // 그런 기능을 가진 다른 SQLException을 던지는 메소드를 호출하는 코드
  }
  catch(SQLException e) {
    // ErrorCode가 MySQL의 "Duplicate Entry(1062)“01면 예외 전환 
    if (e.getErrorCode() == MysqlErrorNumbers.ERJDUP_ENTRY)
     throw DuplicateUserldException(); 
    else
     throw e; // 그 외의 경우는 SQLException 그대로
  }
}
```
예외포장
```text
try {
    OrderHome orderHome =EJBHomeFactory.getlnstance().getOrderHome(); 
    Order order =orderHome.findByPrimaryKey(Integer id);
} catch (NamingException ne) { 
    throw new EJBException(ne);
} catch (SQLException se) { 
    throw new EJBException(se); 
} catch (RemoteException re) {
    throw new EJBException(re);
}

```