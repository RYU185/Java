package P1031;

public class Constructor1 {
    public static void main(String[] args) {
        A a = new A();
        a.work();
        B b = new B();
        b.work();
        // C c = new C();
        // c work(); // error : class C는 기본생성자를 사용할 수 없음
        C c = new C(100);
        c.work(); // 100
    }
}

class A {
    int m; // 필드
    void work(){ // 메서드
        System.out.println(m); // 0;
    }
    // 기본생성자를 만들지않으면 자바가 자동으로 기본생성자를 생성해줌
}

class B {
    int m;
    void work(){
        System.out.println(m); // 0 ( int의 default값은 0이므로 )
    }
    // 생성자를 만드는 규칙
    // 클래스와 이름이 동일
    // 리턴형이 없다
    B() { // 기본생성자를 생성한 경우
        System.out.println("B의 기본생성자");
        // 기본생성자를 만들면 만들어져 있는 이 생성자를 사용
    }
}


class C {
    int m;
    void work(){
        System.out.println(m);
    }
    C(int a){ // 기본생성자가 아닌 매개변수가 있는 생성자만 만들 경우
        m = a; // 위의 m에 a값을 대입하겠다.
    }
    // <중요> 클래스 내에 생성자가 없으면 기본생성자 자동 생성
    // 생성자가 있으면 (어떤것이든 상관없이) 기본생성자 자동생성 X
    // == 생성자를 만들었다면 그 생성자를 사용해야 함.
}





























