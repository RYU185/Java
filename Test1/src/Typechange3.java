public class Typechange3 {
    public static void main(String[] args) {
        //기본 자료형 간의 연산 규칙
        /*연산은 반드시 같은 타입끼리만
        (byte + byte = int,
        short + short = int)
        * 만약 다른 기본자료형 끼리 연산한다면
        * 저장범위가 큰 데이터타입을 따라간다
        * (예외: byte + short = int)
        * 4바이트를 기본으로 하는 Java는 byte와 short의 연산값을 계산하는 것보다 int로 연산하는 것이 효율적이라고 판단함.

        * 순서: byte < short < int < long < float < double
        */

        int value1 = 3 + 5;
        int value2 = 8 / 5;
        float value3 = 3.0f + 5.0f;
        double value4 = 8.0 / 5.0;

        byte data1 = 3;
        byte data2 = 5;
        // byte value5 = data1 + data2  <- data1, data2는 int형이므로 오류발생. 때문에 23line으로 연산
        int value5 = data1 + data2;

        System.out.println(value1); // 결과값 8
        System.out.println(value2); // 결과값 int 1
        System.out.println(value3); // 결과값 float 8.0
        System.out.println(value4); // 결과값 double 1.6
        System.out.println(value5); // 결과값 8

        //다른 자료형 간의 연산
        //int value6 = 5 + 3.5; <- double로 따라가야하는데 int를 만들수 없어서 오류발생

        double value6 = 5 + 3.5; // 5는 int, 3.5는 double
        int value7 = 5+(int)3.5; // 5는 int, 3.5를 int로 다운캐스팅 (비추천)

        double value8 = 5/2.0;
        byte data3 = 3;
        short data4 = 5;
        int value9 = data3 + data4; // byte + short = int (3+5=8)
        double value10 = data3 + data4; // 3.0 + 5.0 = 8.0

        System.out.println(value6); // 결과값 8.5
        System.out.println(value7); // 결과값 8 (int 이므로)
        System.out.println(value8); // 결과값 2.5 (double)
        System.out.println(value9); // 결과값 8 ( byte + short = int )
        System.out.println(value10); // 결과값 8.0 ( byte + short = int의 값을 double로 업캐스팅 )

        boolean flag = true;

        short data$;
        char name;
        int name3;
        final int $MY_DATA;



        System.out.println((int)5.6+3.5);
        System.out.println((int)5.6+(int)3.5);
        System.out.println((int)(5.6+3.5));
        System.out.println(7/4);
        System.out.println((double)3/2);
        System.out.println((double)(3/2));
    }
}