package Overriding;

import java.sql.SQLOutput;

class S1 {
    static int m = 3; // 정적 필드

}
class S2 extends S1{
    static int m = 4; // 정적 필드
}

// 정적필드 오버라이딩 가능 여부 확인
public class StaticField {
    public static void main(String[] args) {
        // 정적 필드는 인스턴스를 만들지 않고 참조 가능
        System.out.println(S1.m);
        System.out.println(S2.m);

        // 객체를 생성하여 참조할 수도 있음 (권장X)
        S1 value1 = new S1();
        S2 value2 = new S2();
        S1 value3 = new S2();  // 업캐스팅
        System.out.println(value1.m); // 3
        System.out.println(value2.m); // 4
        System.out.println(value3.m); // 3
        // 정적 필드도 오버라이딩할 수 없음
        // 애초에 메모리의 생성 위치가 다르다
        // 생성 위치가 독립적으로 만들어지므로 각자 존재한다.
        // 데이터 타입에 따라 참조되는 값이 달라짐
    }

}
