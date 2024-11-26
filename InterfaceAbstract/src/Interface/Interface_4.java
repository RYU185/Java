package Interface;

// 인터페이스의 객체 생성
// #2. 익명 이너클래스를 사용한 객체 생성

interface C1{
    int a= 3;
    void abc();

}
public class Interface_4 {
    public static void main(String[] args) {
        C1 value1 = new C1() {
            @Override
            public void abc() {   // 이 클래스 자체가 생성자로 작용하기때문에 C1 value1 = new C1()을 사용할 수 있음
                System.out.println("익명 이너클래스를 사용한 인터페이스 객체생성");
            }
        };
        value1.abc();
    }
}
