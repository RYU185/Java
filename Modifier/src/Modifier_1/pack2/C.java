package Modifier_1.pack2;

import Modifier_1.pack1.A;

public class C {
    public void print(){
        A a = new A();  // public 과 관계없이 다른 패키지에 있는건 임포트 해야함
        System.out.print(a.a + " ");
//        System.out.print(a.b + " "); // protected 외부패키지 접근 불가
//        System.out.print(a.c + " "); // default 외부패키지 접근 불가
//        System.out.print(a.d + " "); // privated 외부클래스 접근 불가
        System.out.println();

    }
}
