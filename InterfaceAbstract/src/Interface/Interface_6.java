package Interface;

interface S {
    static void abc(){
        System.out.println("S 인터페이스의 정적(static) 메서드");
    }
}

// 스태틱 메서드는 디폴트 메서드처럼 기존 인터페이스에 추가하더라도 이미 구현된 클래스들에 영향을 미치지 않는다
// 차이점#1. 오버라이드가 불가능함
// 차이점#2. 인스턴스화없이 공용 기능을 제공
public class Interface_6 {
    public static void main(String[] args) {
        S.abc(); // 정적 메서드이므로 인스턴스 생성없이 바로 출력
    }
}
