import java.sql.SQLOutput;

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

        // 비트연산자는 무조건 2진수로 변환하여 int로 출력된다
        // & 비트연산자 (AND)
        System.out.println(3&10); // 2
        // 실제로는 3, 10과 같은 숫자가 들어가지 않고 변수가 할당된다.
        System.out.println(12&9); //8

        System.out.println(Integer.toBinaryString(12)); // 12를 2진수로 변환: 1100
        System.out.println(Integer.toBinaryString(9)); // 9를 2진수로 변환: 1001
        /*1100
        * 1001 을 &로 비교하였을때 참인것만 1
        * 1000 = 8 */
        System.out.println();

        // | 비트연산자 (OR)
        System.out.println(3|10); // 11
        System.out.println(Integer.toBinaryString(3)); // 0011
        System.out.println(Integer.toBinaryString(10)); // 1010
        /*0011과 1010을 | (or)로 비교하였을 때, 1이 한쪽에라도 있으면 1.
        * 0011
        * 1010
        * 1011 = 11 */

        // ^ 비트연산자 (XOR) : 서로 다른 값이 있어야 1
        System.out.println(5^14);
        System.out.println(Integer.toBinaryString(5)); // 0101
        System.out.println(Integer.toBinaryString(14)); //1110
        // 0101
        // 1110 비교
        // 1011 = 10진수로 11

        // ~ 비트연산자 (NOT)
        /* 2진수로 음수 만드는 방법
        * 10진수 정수값인 2는 기본적으로 int임 (32비트)
        * 2 = 0000 .... 0000 0010
        * NOT 1111 .... 1111 1101 로 변환
        *     여기에 1을 더함
        *     1111 .... 1111 1110 = -2

        * 5 - 3 = 2 (인간의 방식)
        * 5 + (-3) = 2 (컴퓨터의 방식) (더하기와 곱하기는 단순함. 빼기와 나누기도 덧셈으로 계산할 수 없을까?)
        * 5 = 0000 .... 0000 0101
        * 3을 -3으로 변환
        * 3 = 0000 .... 0000 0011
        *     1111 .... 1111 1100 + 1
        *-3 = 1111 .... 1111 1101

        * 5 + (-3)
        *     0000 .... 0000 0101
        *  +  1111 .... 1111 1101
        *  =  0000 .... 0000 0010 (맨 마지막 0도 자리수를 올려야하는데 더이상의 메모리가 없으면 사라진다!!)
        *  = 10진수로 2
        *
        * !! 2진수 중 어떤 자리에 1이 있는지 0이 있는지 내가 알고싶은 정보만 알 수 있도록 해주는 비트연산자 !!
        */
            }
}
