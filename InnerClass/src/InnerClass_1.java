// Outer class 아우터 클래스 (외부 클래스) 2024/11/14

class A1 {
    public int a= 3;
    protected int b = 4;
    int c = 5;
    private  int d = 6;
    void abc (){
        System.out.println("A클래스 abc()");
    }
    // Inner class 이너 클래스 (내부 클래스)
    class B1 {
        void bcd(){
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
            System.out.println(d);
            abc();
        }

    }
}

public class InnerClass_1 {
    public static void main(String[] args) {
        // 1. 아우터클래스의 객체생성
        A1 a1 = new A1();
        // 2. 이너클래스의 객체생성
        // B1 b1 = new B1();  // 이너클래스는 아우터클래스없이는 접근할 수 없다
        A1.B1 b1 = a1.new B1();  // 표기법 복잡함 B1은 단독으로 쓸수없으니 A1.B1으로 표기.
        b1.bcd(); // A클래스 abc()
        // 결론적으로 이너클래스는 아우터클래스의 멤버를 모두 접근할 수 있다.
    }
}
