package Modifier_1;

import Modifier_1.pack1.A;
import Modifier_1.pack1.B;
import Modifier_1.pack2.C;
import Modifier_1.pack2.D;

public class Modifier_1 {
    public static void main(String[] args) {
        A a = new A();
        //System.out.println(a.d);  // 클래스의 은닉 (캡슐화)
        a.print();  // 1 2 3 4  // A와 Modifier는 다른 패키지에 있기때문에 public이어야 한다.
        B b = new B();
        b.print();  // 1 2 3
        C c = new C();
        c.print();
        D d = new D();
        d.print();
    }
}
