package Inheritance_1;

// 단순한 상속관계
class A {}
class B extends A{}
class C extends B{}
class D extends B{}


             // 다형성
public class Polymorphism {
         public static void main(String[] args) {
             // <중요> 인스턴스의 타입은 생성자에 의해 결정된다!
             // 대입연산자 왼쪽의 타입은 상속관계에 의해 부모클래스일 수 있다.

             // A
             A a1 = new A();
             A a2 = new B(); // 업캐스팅, B는 A이다.
             A a3 = new C();  // 업캐스팅 C는 A이다.
             A a4 = new D();  // 업캐스팅 D는 A이다.

             // B
             // B b1 = new A();  // 잘못된 전제: 에러 다운캐스팅: A는 B이다 (X), 잘못된 명제
             B b2 = new B();
             B b3 = new C();
             B b4 = new D();

             // C
             // C c1 = new A();  // A는 C이다 (X)
             // C c2 = new B();  // B는 C이다 (X)
             C c3 = new C();
             // C c4 = new D();  // D는 C이다 (X)

             // D
             // D d1 = new A();
             // D d2 = new B();
             // D d3 = new C();
             D d4 = new D();

             // 형태를 기억해야한다
             // A <- B / B <- C / B <- D

             // 타입 캐스팅
             A ac = new C();  // C는 A로 바꾸는 업캐스팅
             B bc = new C();  // C를 B로 바꾸는 업캐스팅
             B bb = new B();
             A a = (A)bb;   // B > A 업캐스팅, 업캐스팅의 새로운 방향

             // 다운캐스팅 ( 가능한경우와 불가능한 경우가 있음 )
             // 생성자에 의해 원래 타입이 결정되므로 부모로 업캐스팅 된 후
             // 다시 원래 타입대로 돌아오는 다운캐스팅은 가능하다.
             B bbb = new B(); // 원래 B타입으로 생성했으므로 원래 B타입
             A aaa = (A)bbb;  // 부모클래스인 A 타입으로 업캐스팅
             B bbb1 = (B)aaa; // 원래 B타입으로 돌아오는 다운캐스팅은 가능함

             A aa = new A();
//             B b = (B)aa; // 다운캐스팅 불가
//             C c = (C)aa; // 다운캐스팅 불가

             A ad = new D();  // 원래 타입은 D인데 A로 업캐스팅
             B db = (B)ad; // A에서 B로 다운캐스팅. D는 B의 자식이기 때문(D는 B이기 때문)
             D dd = (D)ad; // A에서 D로 다운캐스팅. 원래 타입이 D

         }
}
