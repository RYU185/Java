package Overriding;

class A {
    int a = 5;
    void print(){
        System.out.println("A 클래스"+a);
    }
}

class B extends A {
    int a = 10;
    void print (){
        System.out.println("B 클래스"+a);

    }
}
public class Overriding_1 {
    public static void main(String[] args) {
        A value1 = new A();
        value1.print(); // A 클래스5

        B value2 = new B();
        value2.print(); // B 클래스10

        A value3 = new B(); // A에서 B를 바라본다. A가 부모클래스이므로 업캐스팅
        value3.print(); // B 클래스10
        // A 클래스의 print()가 자식클래스의 print()로 오버라이딩되었기 때문
        // 교재 328페이지 필기 참고
        // 오버라이딩은 인스턴스 메서드에만 적용됨 (필드영역은 정적바인딩이기때문에 해당되지않는다)
        System.out.println(value3.a); // 5
        B value4 = (B)value3; // 다운캐스팅
        System.out.println(value4.a); // 10
    }
}
