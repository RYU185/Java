package Modifier_1.pack1;

public class B {
    public void print() {
        A a = new A();
        System.out.print(a.a + " ");
        System.out.print(a.b + " ");
        System.out.print(a.c + " ");
        // System.out.print(a.d + " ");   // >>>d는 같은 패키지 안에 있기때문에 접근 불가임.

        System.out.println();
    }
}
