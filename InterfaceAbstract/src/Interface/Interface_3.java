package Interface;

// 인터페이스의 객체 생성
// #1. 자식클래스의 생성자를 이용하는 방법
interface B1{
    int a = 3;  // 인터페이스의 정적상수 필드는 반드시 선언과 동시에 초기화해주어야 함
    void abc(); // abstract가 없어도 자동으로 추상 메서드임
}
class B2 implements B1{  // B1이 인터페이스이므로 implement 사용
    @Override
    public void abc() {
        System.out.println("인터페이스 B1의 자식클래스 B2");
    }
}

public class Interface_3 {
    public static void main(String[] args) {
        // B1 value1 = new B1(); // 에러발생, 인스턴스화 할 수 없음!(인터페이스는 생성자가 없기때문에)
        B1 value1 = new B2(); // B2클래스를 인스턴스화하고 B1으로 업캐스팅
        B2 value2 = new B2(); // 인터페이스도 데이터 타입의 일종이기때문에 업캐스팅은 가능하다. 다만 생성자가 없어 인터페이스 자체는 인스턴스화가 불가능하다.
        value1.abc();
        value2.abc();
    }
}


