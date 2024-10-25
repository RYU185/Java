import java.sql.SQLOutput;

public class Variable1 {
    public static void main(String[] args) {
        System.out.println("예제1");
        byte a = 1;
        // 명령이 2개
        // 1. 예제1 이라는 문자열을 화면에 출력하라
        // 2. byte타입의 크기(1바이트)만큼 메모리를 할당하여 그 주소를 a라고 지정하고 a 위치에 숫자 1을 저장한다.
        byte b = 2;
        b = 3; // 기존 메모리 위치 b에 할당된 2를 3으로 덮어씌운다라는 의미.
        int c = a+b;
        System.out.println(c);
        /*byte a, b는 byte인데
        * c는 왜 int로 지정해주는가?
        * byte + byte = int
        * int + int = int        */
        char ch1 = 'A';
        char ch2 = 'B';
        System.out.println(ch1);
        System.out.println(ch2);
        // char는 문자 1개만 와야하고 ' '(단따옴표)를 사용함
        // 문자 여러개는 " "(쌍따옴표)

        System.out.println(ch1+ch2);
        // Q: 출력값이 131. 왜 AB가 아니고 131이라는 엉뚱한 숫자가 출력되는가?
        // A: 자바의 동작방식을 이해해야함
        // 자바는 +를 우선적으로 숫자로서 더해야 한다는 노력을 함. 우선적으로 숫자화하여 연산하려는 자바의 동작방식.
        // 그러므로 유니코드 상의 숫자로 치환하여 계산한다. (유니코드 상 A가 65, B가 66일 것이다.)
        // 때문에 내가 원하는 AB라는 값을 도출하기 위해 위의 A, B를 숫자가 아닌 "문자"로 인식하게 해야함
        System.out.println(""+ch1+ch2);
        System.out.println(""+ch1+ch2);

        // System.out.println("한글"+1+2+3) 의 결과값이 한글123이 된 것과 원리가 같음.
        // 빈 문자열이 포함되면서 숫자가 아닌 문자의 더하기로 인식한다.
        System.out.println(ch1); // 결과값 A가 나오지만 유니코드 65를 출력하기 위한 방법은 무엇일까?
        System.out.println(+ch1); // 유니코드 65 출력 (가능한 경우에 한하여 "타입변환")
                                  // + 기호는 숫자로 변환하라는 뜻
        System.out.println(+ch1 + +ch2); // 명시적으로 ch1, ch2에 +를 붙여 유니코드 상 131이라는 결과값을 유도함

        String name = "김동근"; // 문자열. 문자가 여러개 모인 것. "김동근"은 ㄱㅣㅁㄷㅗㅇㄱㅡㄴ 이 모여 만들어진 문자열이다.
        // 문자는 char, 문자열은 String 사용.
        // 지정하는 문자열에 따라 바이트가 달라지는 가변성을 지님
        System.out.println(name);

        // Boolean (참, 거짓)
        boolean bool = true; // true는 참, false는 거짓. 논리적으로 참/거짓이라고 하는 예약어. 문자도, 문자열도 아니다.
        System.out.println(bool);

        final double PI = 3.14;

        /* 변수와 상수의 이름짓는 규칙
        1. 영문 대소문자와 한글 (한글은 비추천)
        2. 특수문자 중 _(밑줄)과 $만 사용 가능( _: 영어로 underscore)
        3. 숫자 가능하지만 첫글자로는 사용 불가 (a1 가능, 1a 불가능)
        4. 예약어는 사용 불가. ex) public, class, void, main, byte, int, char, true, String, etc...
        상수는 변수와 구분하기 위해 대문자로.

         */


            }
}
