package Interface;

interface D1 {
    void abc();
    public default void bcd(){
        System.out.println("인터페이스 D1의 디폴트 메서드"); // default 접근지정자 아님!!
    }
}
class D2 implements D1{
    @Override
    public void abc() {} // 추상메서드 abc() 오버라이드
    // <중요> 디폴트메서드는 오버라이드 하지않아도 됨!! > 이게 인터페이스에서 나중에 추가된 기능1
}
class D3 implements D1{
    @Override
    public void abc() {} // 추상메서드 abc() 오버라이드

    @Override
    public void bcd() {
        D1.super.bcd(); // 디폴트메서드 bcd()는 오버라이드해도 무관하다. 해도되고 안해도되고.
    }
}

// 디폴트메서드는 기존 인터페이스를 수정 및 업데이트해도 기존 구현 클래스를
// 수정할 필요가 없도록 기본 구현을 제공할 수 있다
// 사후에 자식 클래스들을 수정할 필요가 없도록 해주는 기능
// 추상 메서드와 달리 구현내용을 가지고 있는 메서드임 (자바 8버전에서 새로 등장)

public class Interface_5 {
}
