package Custom;

// 사용자 정의 예외
// 사용자 정의 예외는 반드시 둘 중에 하나의 예외클래스를 상속받아야 한다.

// #1 일반 예외 Exception을 상속
class MyException extends Exception {
    public MyException(){
        super();
    }
    public MyException(String message){
        super(message);
    }
}

// #2 실행예외 RuntimeException을 상속
class MyRTExecption extends RuntimeException{
    public MyRTExecption(){
        super();
    }
    public MyRTExecption(String message){
        super(message);
    }
}

class A {  // 예외 직접 처리
    void setAge(int age) {
        try {
            if (age >= 0) {
                System.out.println("정상 동작");
            } else {
                // 예외발생
                // 반드시 사용자 정의 예외의 객체를 새로 만들어서 던져야 함
                throw new MyException("나이가 음수입니다");
            }
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
    }
}

class B {  // 예외 전가
    void setAge(int age) throws MyException {
        if (age >= 0) {
            System.out.println("정상 동작");
        } else {
            throw new MyException("나이가 음수입니다");
        }
    }
    void callSetAge(int age){
        try{
            setAge(age);
        }catch (MyException e){
            System.out.println(e.getMessage());
        }
    }
}


public class CustomException_1 {
    public static void main(String[] args) {
        A a = new A(); // 예외 직접처리
        a.setAge(-1);

        B b = new B(); // 예외 전가처리
        b.callSetAge(-1);
    }
}
