package TypeCasting;

import java.sql.SQLOutput;

class A {
    int a = 3;
    void methodA (){
        System.out.println("A 클래스");
    }
}
class B extends A{
    int b = 4;
    void methodB() {
        System.out.println("B 클래스");
    }

}

public class TypeCasting_1 {
    public static void main(String[] args) {
        // 1. A타입
        A value1 = new A();
        System.out.println(value1.a);  // 3
        value1.methodA(); // A 클래스


        // 2. B타입
        B value2 = new B();
        System.out.println(value2.a);  // 3
        System.out.println(value2.b); // 4
        value2.methodA(); // A 클래스
        value2.methodB(); // B 클래스

        // 3. B -> A 업캐스팅
        A value3 = new B();
        System.out.println(value3.a); // 3
        value3.methodA(); // A 클래스

        B value4 = (B)value3; // 다시 원래(B)타입으로 돌아오는 다운캐스팅
        System.out.println(value4.b);  // 4
        value4.methodB(); // B 클래스

        // 왜 업캐스팅과 다운캐스팅을 하는가?
        // 우리는 B에서 상속받은 A의 데이터와 본래 B의 데이터를 읽을 수 있다
        // 하지만 읽기 위해서 / 사용하기 위해서 업캐스팅/ 다운캐스팅을 한것이 아니라
        // X Y를 모두 배열에 담기 위해서 어쩔수없이 업캐스팅
        // 그 상황에서 B와 methodB를 사용하고 싶은 상황 = 어쩔수없이 다운캐스팅을 해야함
    }
}
