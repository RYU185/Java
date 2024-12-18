package Custom;

// Exception과 RuntimeException의 차이
/* 예외전가를 구현할 때 MyException과 MyRTException의 구현상 차이점이 존재함
1) MyRTException의 경우,
예외처리를 하지 않고 call 메서드가 throw하지 않아도 JVM이 예외처리를 해줌
물론 JVM의 예외처리는 catch문과는 다르다)
==> 자바 컴파일러는 RuntimeException 계열의 경우, 예외처리를 강제하지 않도록 설계되어있음
2) MyException의 경우,
예외처리(catch)를 하지않고 call 메서드가 throw하지 않으면 컴파일 에러가 발생한다
반드시!! 콜스택 내의 모든 메서드들이 throw하지 않으면 컴파일에러가 발생함 (main()도 throw 가능함)
 */

class C {
    void setAge(int age) throws MyRTExecption {
        if (age >= 0) {
            System.out.println("정상 동작");
        } else {
            throw new MyRTExecption("음수는 나이로 표기할 수 없습니다");
        }
    }
    void callSetAge(int age){
        setAge(age);
    }
}

class D {
    void setAge(int age) throws MyException {
        if (age >= 0) {
            System.out.println("정상 동작");
        } else {
            throw new MyException("음수는 나이로 표기할 수 없습니다");
        }
    }
    void callSetAge(int age) throws MyException{
        setAge(age);
    }
}



public class CustomException_2 {
    public static void main(String[] args) throws MyException {  // main도 던질 수 있다
//        C c = new C();
//        c.callSetAge(-1);

        D d = new D();
        d.callSetAge(-1);

    }
}
