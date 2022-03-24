package exceptions;

public class BadException {

    //초난감 예외처리 코드1
    public void method() {
        try {

        } catch (Exception e) {
            //예외를 잡고 아무것도 하지않는다.
        }
    }

    //초난감 예외처리 코드2
    public void method2() {
        try {

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    //초난감 예외처리 코드3
    public void method3() {
        try {

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 초난감 예외처리4 메소드 선언에 throws Exception을 기계적으로 붙이는 개발자도있다.
    public void method11() throws Exception {
        method22();
    }

    private void method22() throws Exception {
        method();
    }
}
