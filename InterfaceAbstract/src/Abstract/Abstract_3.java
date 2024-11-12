package Abstract;

// 추상클래스의 객체생성
// 추상클래스는 그 자체로 인스턴스를 생성할 수 없음
// 자식클래스를 이용할 뿐
// 하지만, 익명 이너클래스를 이용하면 인스턴스를 생성할 수 있다. (권장X, 익명이라는 단어에 주목)

abstract class A{
    abstract void abc();
}


public class Abstract_3 {
    public static void main(String[] args) {
        // 원래라면 외부에 A클래스를 상속받아 오버라이드를 구현해야 하나,
        // 인스턴스를 한번만 사용할 목적으로 아래와 같이 익명 이너클래스를 사용할 수 있음
        A a1 = new A() {
            @Override
            void abc() {
                System.out.println("익명 이너클래스로 객체 생성");
            }
        };
        a1.abc();
        // 단점.
        // a1 이외의 다른 인스턴스를 사용하려면 다시 익명 이너클래스를 새로 만들어야함
        A a2 = new A() {
            @Override
            void abc() {
                System.out.println("새로운 익명 이너클래스");
            }
        };
        a2.abc();
    }
}
