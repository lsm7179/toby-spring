package badException;

import java.sql.SQLException;

public class BadException {

    //초난감 예외처리 코드1
    public void method(){
        try{

        }catch (Exception e){
            //예외를 잡고 아무것도 하지않는다.
        }

    }

    //초난감 예외처리 코드2
    public void method2(){
        try{

        }catch (Exception e){
            System.out.println(e);
        }

    }

    //초난감 예외처리 코드3
    public void method3(){
        try{

        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
