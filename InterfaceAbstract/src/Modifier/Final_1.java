package Modifier;

class A1{
    int a = 3;
    final  int b = 5;   // final을 필드에 적용가능. 선언과 동시에 초기화
    A1(){}

}

class A2 {
    int a;
    final int b;        // final을 필드에 적용. 선언 따로, 초기화 따로 가능
    A2() { a=3; b=5;}   // final은 초기화를 하지 않으면 에러
}

class A3 {
    int a = 3;
    final int b = 5;

    A3() {
        a = 5; // b =9;  // final은 초기화가 된 후에는 생성자에서도 값을 변경할 수 없다
    }
}
class B {
    void bcd(){           // 메서드 중괄호 안에는 지역변수
        int a = 3;
        final int b = 5;  // final은 지역변수에 사용가능
        a = 7;

    }
}

public class Final_1 {
    public static void main(String[] args) {
        A1 a1 = new A1();
        A2 a2 = new A2();
        A3 a3 = new A3();
        a1.a = 10;
//        a2.b = 10;  final 필드는 변경이 불가능하다
        a2.a = 10;
//        a2.b = 10;  final 필드는 변경이 불가능하다

        System.out.println(a1.a); // 10
        System.out.println(a1.b); // 5
        System.out.println(a2.a); // 10
        System.out.println(a2.b); // 5


    }
}
