package Interface;

// 인터페이스의 구성요소
interface A1 {
    // 필드에는 상수만 존재함
    public static final int a = 3;
    // 생성자는 존재하지 않는다
    // 추상메서드
    public abstract void abc();
}
interface A2{
    int b = 3; // 앞에 final을 생략해도 자동으로 public static final이 추가됨
    void bcd(); // 앞에 생략해도 자동으로 public abstract 이 추가됨
}
public class Interface_2 {
    public static void main(String[] args) {
        // A2.b는 정적상수이므로 인스턴스없이 접근가능
        System.out.println(A2.b);  // 3
        // A2.b = 5; // 에러발생, b는 상수(final)
    }

}
