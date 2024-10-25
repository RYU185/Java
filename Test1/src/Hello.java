public class Hello {
    public static void main(String[] args) {
        // Hello World를 출력하는 클래스입니다.(코드가 아닌 주석이기 때문에 컴파일러가 스킵함)
        // main이 코드를 작동하게 함. 시작할때 무조건 main으로 시작.
        System.out.println("Hello World");
        // 작은 사이즈의 프로그램 Hello, 안에 main method 실행, ln은 line.
        // main method 안에 System.out.println("Hello World"); 라는 명령을 넣어 실행
        // 출력된 값을 표시하는 화면 하단은 터미널. 오로지 개발자를 위한 화면.
        // 현재 실행중인 코드가 어떤 작업을 진행중인지 모니터링 할수있도록 남기는 기록 = 로그(Log), 로그를 남기는 행위 = 로깅(Logging)
        // 버그/에러가 났을 때 기록을 남기는 용도 = 버그를 고치기 위해
        System.out.println("1");
        System.out.println("2");
        System.out.println("3");
        System.out.println("4");
        System.out.println(1 + 2);
        System.out.println("1" + "2");
        // println은 줄마다 띄어짐, 개행(ln을 새로 만든다). ln이 없다면 붙여쓴다
        // ln 14과 15의 차이를 명심하자. 15번은 문자 1과 문자 2를 그저 붙여쓴 것이지 문자 12를 출력한 것이 아니다.
        System.out.print("3");
        System.out.println("5");
        // 출력결과: 35
        // " "는 문자열을 의미한다. " " 안에 내용이 무엇이든 있는 그대로 컴퓨터가 받아들인다는 뜻. "1"은 숫자 1이 아닌 문자 1로 받아들인다.
        System.out.println("ryu"+1+8+5);
        int a = 3;
        //변수 a = 3
        String b = "화면";
        // b = 화면 (문자열)
        // String은 숫자를 넣을수 없음. Only 문자열만.
        System.out.println(a);
        // 출력결과: 3
        System.out.println(b);
        // 출력결과: 화면
        System.out.println(b+"출력");
        // 출력결과: 화면출력
        System.out.println(b+"RYU");
        // 출력결과: 화면RYU
        System.out.println("화면 출력");
        // 출력결과: 화면 출력

        System.out.println("한글"+1+2+3);
        // 출력결과: 한글123
        System.out.println(1+2+3+"한글");
        // 출력결과: 6한글

        /*구조
        * 위로 갈수록 사용자(복잡하다), 아래로 갈수록 기계에 가깝다(단순하다)
        * 소스코드(.java)를 컴파일러가 바이트코드(.class, 2진데이터)로 변환하여 건네줌
        * JVM이 Windows, Mac, Linux에 맞춰진 코드를 출력 = 자바의 플랫폼 독립성
        * IDE는 JDK를 사용하는 작업툴
        * JDK는 그저 기술 이름일 뿐 실체가 없다
        * (JRE, 컴파일러, 디버깅)
        * SDK > JDK > JRE */



    }
}
