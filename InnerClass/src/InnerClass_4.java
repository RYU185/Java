// 지역 이너클래스
class A4 {
    int a = 4;
    void abc(){
        int b= 5;
        class B4 { // 지역 이너클래스 - 메서드 안에 정의된 클래스
            void bcd(){
                System.out.println(a);
                System.out.println(b);
            }
        }
        // 지역 이너클래스는 메서드의 지역범위 내에서만 접근 가능하며
        // 메서드가 실행될 때 정의되고 메서드가 종료되면 해당 범위를 벗어나므로
        // 외부에서 직접 사용될 수 없음
        // 즉, 메서드 외부에서는 지역 이너클래스의 존재 자체를 알 수 없고
        // 당연히 객체 생성도 불가능한 상태가 된다.


        //지역 이너클래스는 거의 대부분 선언부 바로 아래에서 객체를 생성함
        B4 bb = new B4();  // 선언
        bb.bcd();  // 객체 생성

    }
}
public class InnerClass_4 {
    public static void main(String[] args) {
        // main에서는 인스턴스를 만들고 써야함
        // A4에서는 필드a와 메서드abc()만 호출할수있으므로
        // B4를 불러올 수 있는 방법이 없다
        A4 a = new A4();
        a.abc();
        // 때문에 B4클래스를 불러오기위해서는 어쩔수 없이 메서드 abc()를 호출해야함

    }

}
