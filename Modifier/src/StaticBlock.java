public class StaticBlock {
    public static void main(String[] args) {
        System.out.println(B.b); // 5.
    }
}

class B {
    int a;
    static int b;
    static { //  스택틱 블록 (정적 필드 초기화)
        // 정적필드의 초기화는 주로 생성자를 사용하지 않는다.
        // static 초기화 블럭은 정적필드를 초기화하기 위해서 사용하며
        // 조건에 따라 다른 값으로 초기화 될 수 있다는 장점이 있음
        b = 5;
        System.out.println("클래스 B가 로딩되었습니다");
    }
}