package GenericBound;

class A2 {
    public < T extends Number> void method1 (T t){
        // Number = 숫자형 Wrapping 추상클래스 (byte, double, float, int, long, short 의 부모 클래스)
        System.out.println(t.intValue());
    }
}

interface MyInterface {
    void print();
}

class B2 {
    // 제네릭에서는 인터페이스라고 implements를 쓰지않는다. 무조건 extends!!
    // 매개변수 t는 반드시 MyInterface의 구현제이어야함
    public <T extends MyInterface> void method1 (T t){
        t.print();
        //구현체 t는 MyInterface의 메서드 print()를 오버라이드함
    }
}

public class GenericBound_2 {
    public static void main(String[] args) {
        A2 a = new A2();
        a.method1(3.5);
        // == a.<Double>method1(3.5);

        B2 b = new B2();
        b.method1(new MyInterface() {  // 익명 이너클래스 사용
            @Override
            public void print() {
                System.out.println("오버라이드 구현");
            }
        });

    }
}
