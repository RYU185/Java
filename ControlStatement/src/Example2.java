public class Example2 {
    public static void main(String[] args) {
        // 다양한 메서드 만들어보기
        // 1. 문자열의 길이를 반환하는 메서드
        String str = "Hello"; // Hello 라는 문자열을 str에 할당
        int length = str.length(); // str의 값을 length라는 메서드로 실행
        System.out.println(length); // 실행한 값을 출력

        // 아래 코드가 작동하도록 메서드를 만드시오.
        System.out.println(getLength("Hello World")); // 11
        System.out.println(getLength("Please help me")); // 14
        System.out.println(getLength("Happy Birthday")); // 14
    }

    public static int getLength(String str) { // 변수선언
        return str.length(); // str에 .length라는 메서드 실행한 값을 return

    }


    }

