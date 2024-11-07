package Super1;

class A {
    void abc(){
        System.out.println("A클래스");
    }
}

class B extends A {
    @Override
    void abc(){
        System.out.println("B클래스 abc");
    }
    void bcd(){
//        System.out.println("B클래스 bcd");
        abc(); // this.abc와 동일하다
        super.abc(); // 부모의 abc(인스턴스)를 찾아서 실행
        // super는 반드시 class 안에서 사용해야함
    }
}


public class Super_1 {
    public static void main(String[] args) {
        B value1 = new B();
        value1.abc();
        value1.bcd();
        A value2 = (A)value1; // 업캐스팅
        value2.abc();
        // value2.bcd(); // 에러... A를 바인딩(참조)하고 있으므로 B영역에 있는 bcd 메서드는 호출이 불가하다.
    }
}
