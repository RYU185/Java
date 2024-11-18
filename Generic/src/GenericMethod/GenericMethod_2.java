package GenericMethod;

class AAA {
    public <T> void method1 (T t){
        // System.out.println(t.length()); // 오류!
        // "T는 Object클래스의 자식이다" 라는 명제는 참
        // 그러므로 T에 Object의 내부메서드는 사용할 수 있음
        // T는 Object의 자식클래스이기 때문
        // .length는 String의 내부 메서드지만 컴파일러가 T가 String이라는 근거를 찾을수 없기때문에 오류

        System.out.println(t.toString());
        System.out.println(t.equals("AAA"));
        System.out.println(t.hashCode());
    }
}

public class GenericMethod_2 {
    public static void main(String[] args) {

    }
}
