package Super1;

class A1 {
    A1() {
        this(3);  // this() 또는 super()는 반드시 첫번째 줄에 있어야 함!
        System.out.println("A1생성자 1");
    }
    A1(int a) {
        System.out.println("A1생성자 2");
    }
}
class B1 extends A1 {
    B1() {
        // super가 기본적으로 포함되있음
        this(3);
        System.out.println("B1생성자 1");
    }
    B1(int a) {
        System.out.println("B1생성자 2");
    }
}
public class Super_3 {
    public static void main(String[] args) {
        A1 value1 = new A1();  // A1생성자2 , A1생성자1 출력
        A1 value2 = new A1(3); // A1생성자2 (변수가 있는 것만) 출력
        B1 value3 = new B1(); // 부모의 생성자를 먼저 한번 호출한다. // A1생성자2, A1생성자1, B1생성자2, B1생성자1 출력
        B1 value4 = new B1(3); // A1생성자2, A1생성자1, B1생성자2 출력
    }
}
