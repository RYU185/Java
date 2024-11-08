package ObjectClass;

class C {
    String name;

    C() {
    }

    C(String name) {
        this.name = name;
    }
}
    class D {
        String name;
        D (){}
        D (String name) {
            this.name = name;
        }
        @Override
        public boolean equals(Object obj){
            return this.name == ((D)obj).name;
        }
}
// C와 D는 상속관계 아님!!!!

public class Object_3 {
    public static void main(String[] args) {
        // Object 클래스의 equals 메서드와 오버라이드한 메서드의 차이 예제
        C c1 = new C("Hello");
        C c2 = new C("Hello");
        System.out.println(c1 == c2); // false // 스택에 있는 위치값 비교는 당연히 false
        System.out.println(c1.equals(c2));  // false  C라서 ==와 결과값 똑같음

        D d1 = new D("Hello");
        D d2 = new D("Hello");
        System.out.println(d1==d2); // false
        System.out.println(d1.equals(d2));  // true
    }
}
