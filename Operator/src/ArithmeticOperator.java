public class ArithmeticOperator {
    public static void main(String[] args) {
        //산술연산자
        System.out.println(2+3); // 5
        System.out.println(8-5); // 3
        System.out.println(7*2); // 14
        System.out.println(7/2); // 3
        System.out.println(8%5); // 3 ( % 모듈로, modulo, 나머지 )
        System.out.println();

        // 증감연산자 ( ++, -- )
        int value1 = 3;
        value1++;
        // value1 + 1; 라는 뜻
        System.out.println(value1); // 4

        int value2 = 3;
        ++value2; // ++를 변수 앞에
        System.out.println(value2);
        // 결과의 차이가 없음. 똑같이 4.


        // 결과가 달라지는 증감연산자
        int value3 = 3;
        int value4 = value3 ++; // java가 ++를 읽기전에 value3에서 멈춰선다. 3을 참조.
                  // value3 = value3 + 1;
        System.out.println(value4); // 때문에 value4가 3을 출력함
        System.out.println(value3); // 그 이후에 ++가 연산됨. 결과값 4.
        System.out.println();

        int value5 =3;
        int value6 = ++value5; // ++가 앞에 왔으므로 증감연산자를 먼저 처리하라
        System.out.println(value5); // 4
        System.out.println(value6); // 4

        // 절대 하지말아야할 것
        int value7 = 3;
        int value8 = 4;
        int value9 = 2 + value7-- + ++value8; // <- 이런거....
        // 풀어서 작성하면
        // value8 =  value8 + 1; // 5
        // int value9 = 2 + value7 + value8;
        // value7 = value7 - 1;

        System.out.println(value7); // 2
        System.out.println(value8); // 5
        System.out.println(value9); // 10

        double num = 3.5;



    }
}
