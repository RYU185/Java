package Interface;

class Myclass{} // 일반클래스
interface A {} // 인터페이스 A
interface B {} // 인터페이스 B

class C implements A{} // 인터페이스를 상속할때는 extends 대신 implements를 사용한다
class D implements A,B {} // 다중 인터페이스 상속 가능

// 일반클래스와 인터페이스를 모두 상속받을 수 있음 (다중상속)
// 클래스 상속은 오직 한개만 가능하고 인터페이스는 여러개를 상속할 수 있음
class E extends Myclass implements A,B {}

public class Interface_1 {
    public static void main(String[] args) {

    }
}
