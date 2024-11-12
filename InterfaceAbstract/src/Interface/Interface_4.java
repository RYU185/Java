package Interface;

// 인터페이스의 객체 생성
// #2. 익명 이너클래스를 사용한 객체 생성

import java.sql.SQLOutput;

interface C1{
    int a= 3;
    void abc();

}
public class Interface_4 {
    public static void main(String[] args) {
        C1 value1 = new C1() {
            @Override
            public void abc() {
                System.out.println("익명 이너클래스를 사용한 인터페이스 객체생성");

            }
        };
        value1.abc();
    }

}
