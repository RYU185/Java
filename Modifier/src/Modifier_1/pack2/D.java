package Modifier_1.pack2;

import Modifier_1.pack1.A;
 // 클래스 D는 클래스 A를 상속한다 ( =extends )
public class D extends A {
    public void print(){
        System.out.print(a + " ");  // A a = new A(); 라고 임포트하지도 않았는데 에러가 나지않는다. = A의 필드를 그대로 상속했기 때문.
        System.out.print(b + " ");  // protected 다른 패키지라 하더라도 예외적으로 자식클래스면 접근 가능
//        System.out.print(c + " ");  // default 는 예외없이 외부 패키지라 접근 불가
//        System.out.print(d + " ");  // privated 상속 관계여도 외부 클래스라 접근 불가
        System.out.println();
    }

}
