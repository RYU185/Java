public class Method1 {
    public static void main(String[] args) {
        // 메서드없이 홀짝을 구분하는 코드
        int num = 4;
        String str  = (num % 2 == 0) ?"짝수":"홀수";
        num = 5;
        str = (num % 2 == 0) ? "짝수":"홀수";
        System.out.println(str);
        num = 6;
        str = (num % 2 == 0) ? "짝수":"홀수";
        System.out.println(str);
        num = 7;
        str = (num % 2 == 0) ? "짝수":"홀수";
        System.out.println(str);
        num = 8;
        str = (num % 2 == 0) ? "짝수":"홀수";
        System.out.println(str);
        num = 9;
        str = (num % 2 == 0) ? "짝수":"홀수";
        System.out.println(str);
        num = 10;
        str = (num % 2 == 0) ? "짝수":"홀수";
        System.out.println(str);
        num = 11;
        str = (num % 2 == 0) ? "짝수":"홀수";
        System.out.println(str);
        System.out.println();
        // 메서드없이는 코드를 매번 반복해줘야 함 == 너무 비효율적이다.
        // num = 4, 5, 6, 7, .... -> loop
        // 중복코드를 없애고 더 단순하게

        // 메서드의 사용 or 호출 (call method) !!
        // 소괄호가 없으면 자바는 checkOddEven 이라는 것이 class인지 변수인지 메서드인지 구분할 수가 없다.
        checkOddEven(4); // 매개변수로 정수 4 사용 , method의 '사용' <<- method의 선언을 받아줌
        checkOddEven(5);
        checkOddEven(6);
        checkOddEven(7);
        checkOddEven(8);
        checkOddEven(9);
        checkOddEven(10); // 매개변수를 소괄호안에 주고싶다면 아래(ln51)의 메서드 소괄호에도 매개변수(데이터타입)를 줘야한다.
        // 나는 1부터 100까지의 홀짝 구분을 원하는데 계속해서 메서드를 반복해줘봤자 똑같은 결과만 나올 뿐
        // ( ) 소괄호 안에 들어가는 인풋input = 매개변수
        System.out.println("메서드의 return");

        checkOddEven(100);
        System.out.println(checkOddEven2(101));
    }

    // 새로운 메서드를 만들기 위해서는 class 바로 다음 뎁스에 존재해야한다
    // main 안에 만들면 안됨!!!

    // method의 선언, 정의
    public static void checkOddEven(int number) { // method 뒤에 반드시 소괄호() 붙여야함
        // int number = 4; 가 내부적으로 동작하고 있음 (checkOddEven(4);에서 던져진 매개변수)
        String str  = (number % 2 == 0) ? "짝수":"홀수";
        System.out.println(str);
            } // 중괄호가 여기서 끝났으므로 다시 checkOddEven(number)로 되돌아감 - 반복
    // 실수Error 주의
    // checkOddEven(int number = 5); >>>>> 매개변수는 메서드에 선언된 값만 입력하자.
    // public static void checkOddEven(number) >>>>> 메서드의 선언/정의는 데이터타입이 있어야한다.


    public static String checkOddEven2(int number) {
        String str = (number % 2 == 0) ? "짝수" : "홀수";
        return str; // return의 뜻: 돌려준다 > return 하는 데이터타입을 public static 뒤에 써줘야함 (String)
        //리턴값을 Hi로 내버려두면 변수가 무엇이든간에 결과는 Hi로 도출된다.
        //올바른 값을 내려면 return str; 로 고쳐야함
    }


    }

