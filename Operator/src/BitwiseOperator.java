public class BitwiseOperator {
    public static void main(String[] args) {
        // 비트연산자
        int data = 13;
        System.out.println(Integer.toBinaryString(data)); // 1101
        System.out.println(Integer.toOctalString(data)); // 15
        System.out.println(Integer.toHexString(data)); // d 16진수의 최댓값은 f
        // method, 메서드 == 뒤에 ( )가 무조건 붙는다
        // main, sout 등
        System.out.println();

        System.out.println(Integer.parseInt("1101", 2)); // 13 *자주 쓰게될 명령어! ,
        // parse: 어떠한 문자열의 의미를 해석하다. 분석하다.
        // 2진수값을 10진수로 분석하여 출력한다.
        // radix: 진수
        // == "2진수값 "1101"을 int(10진수인 정수값)로 바꿔줘."
        System.out.println(Integer.parseInt("15",8));
        System.out.println(Integer.parseInt("d",16));
        System.out.println();

        System.out.println(13);
        System.out.println(0b1101);
        System.out.println(015);
        System.out.println(0xd);
        System.out.println();

    }
}
