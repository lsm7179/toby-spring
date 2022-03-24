package exceptions;

public class LeastBetterException {

    //그나마 나은 예외처리
    public void method(){
        try {

        }catch (Exception e){
            e.printStackTrace();
            System.exit(1);
            // 물론 실전에서 이렇게 만들라는건 아니다.
        }
    }
}
