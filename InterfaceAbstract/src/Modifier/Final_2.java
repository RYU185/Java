package Modifier;
// final 메서드와 final 클래스 예제

class A {
    void abc(){}
    final void bcd (){}  // 오버라이드 불가능
}

class B1 extends A{
    @Override
    void abc() {
        super.abc();
    } // 부모의 해당메서드를 호출하겠다는 의미

//    @Override
//    void bcd(){}  오버라이드 불가
}

final class C {}
// class D extends C {}  // Cannot inherit from final 'C'  // C라는 final클래스는 상속이 불가능하다!

public class Final_2 {
    public static void main(String[] args) {

    }
}
