import java.sql.SQLOutput;

class A {
    void abc() {
        bcd();
    }
    void bcd(){
        // 예외가 발생하는 메서드에서 바로 예외처리
        try{
            System.out.println(3/0);
        }catch (ArithmeticException e){
            System.out.println("클래스 A 예외 발생");
            System.out.println(e.getMessage());
        }
    }
}

class B {
    void abc(){
        try {
            bcd();
        }catch (ArithmeticException e){
            System.out.println("클래스 B 예외 발생");
            System.out.println(e.getMessage());
        }
    }
    void bcd() throws ArithmeticException {
        System.out.println(3/0); // 예외는 발생하지만 예외전가 처리
    }
}

public class ExceptionThrow_1 {
    public static void main(String[] args) {
        A a = new A(); // 일반 예외처리 (try ~ catch문)
        a.abc();

        B b = new B(); // 예외 전가처리 (실제 예외처리는 호출한 메서드가 함)
        b.abc();

    }
}
