package Static_1;

public class Static_1 {
    public static void main(String[] args) {
        A a1 = new A ();  // 인스턴스 a1 생성해야 읽을 수 있음.
        System.out.println(a1.m);  // 3
        // 정적필드 읽기 1
        System.out.println(A.n); // 5
        // 정적필드 읽기 2
        A a2 = new A ();
        System.out.println(a2.n); // 5 인스턴스필드와 읽는 방법 동일 (권장하지 않음)

        // 정적필드 수정
        A.n = 10; // 정적필드는 오직 한개만 존재함
        System.out.println(a1.n); // 10
        System.out.println(a2.n); // 10

        a1.n = 7;
        a2.n = 8;
        System.out.println(a1.n); // 8
        System.out.println(a2.n); // 8

    }
}

class A {  // 자바는 static으로 클래스를 만들수 없다
    // 필드
    int m = 3;         // 인스턴스 필드
    static int n = 5;  // 정적 필드 ( = static 필드 )

}
