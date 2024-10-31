package P1031;  // 패키지 정의 부분 ( 인텔리제이가 자동으로 부여 )


// #1. 다른 패키지에 있는 외부클래스르르 사용하려면 import를 해야만 함
//import java.util.Arrays;

// Myclass.java 파일내의 유일한 public 클래스
// 반드시 파일명과 클래스 이름이 동일해야함
public class Myclass {
    public static void main(String[] args) {
        String[] str = {"Hello", "World"};
        //System.out.println(Arrays.toString(str));

        // #2. import 없이 풀네임으로 사용할 수도 있음
        System.out.println(java.util.Arrays.toString(str));

        ExternalClass a = new ExternalClass(); // 외부클래스는 이렇게 인스턴스화가 가능하다
        ExternalClass2 a2 = new ExternalClass2(); 
    }
}

class ExternalClass {
    // 외부클래스를 같은 파일 내에 정의한 경우
    // 외부클래스는 public을 사용할 수 없다.
}