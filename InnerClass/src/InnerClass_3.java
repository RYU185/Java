// 정적 이너클래스  2024/11/14
class A3{
    int a = 3;
    static int b = 4;
    void method1() {
        System.out.println("인스턴스 메서드");
    }
    static void method2(){
        System.out.println("정적 메서드");
    }
    static class B3 {
        static void bcd(){
            // 인스턴스 필드 a와 인스턴스 메서드 method1은
            // A3클래스가 메모리에 생성되어야 만들어지는 멤버이므로 (초기화가 필요하므로)
            // A3클래스의 인스턴스없이 참조가 불가능
            // 정적 메서드는 오직 정적 필드와 메서드만 참조 할 수 있다.
            // System.out.println(a);
            System.out.println(b);
            // method1();
            method2();
        }
    }
}


public class InnerClass_3 {
    public static void main(String[] args) {
        A3.B3.bcd();

    }
}
