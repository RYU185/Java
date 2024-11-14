// 익명 이너 인터페이스
class C1 {
    // 이너 인터페이스: 클래스 안에 선언된 인터페이스
    // 접근방법 : C1.D
    interface D {
        void method1();
    }
}
class C2 implements C1.D{
    @Override
    public void method1() {
        System.out.println("이너 인터페이스의 구현 클래스");
    }
}

public class InnerInterface {
    public static void main(String[] args) {
        // 이너 인터페이스의 객체생성 1번. 구현클래스 이용
        C1.D value1 = new C2();
        value1.method1();
        // 이너 인터페이스의 객체생성 2번. 익명 이너클래스 사용
        C1.D value2 = new C1.D() {
            @Override
            public void method1() {
                System.out.println("익명 이너클래스로 객체 생성");
            }
        };
        value2.method1();
    }
}
