public class Typechange2 {
    public static void main(String[] args) {
        // 업캐스팅 (int 기준)
        float value1 = 3; // 정수를 실수로
        System.out.println(value1); // 3.0

        long value2 = 5;
        double value3 = 7;
        // 다운캐스팅 (int 기준)
        byte value4 = 9;
        short value5 = 11;
        System.out.println(value5);
        System.out.println();


        // 다운캐스팅인데 에러가 발생하는 경우
        byte value6 = (byte)128;
        // 앞에 (데이터타입)숫자 로 캐스팅이 발생할시 명시적인 캐스팅을 평소에 습관들이자.
        System.out.println(value6); //-128이 나오는 이유. 데이터 순환형. 표현할수 있는 범위가 -2^7 ~ 2^7-1 *p.78 전공자라면 파트 참조

        int value7 = (int)5.6;
        System.out.println(value7); // 소수점(실수)인데 int로 다운캐스팅 = 5
        float value8 = (float) 9;
        System.out.println(value8); // 정수인데 float로 업캐스팅 = 9.0 (소수점까지 표현해줌)

        String str1 = "Hello";
        System.out.println(str1);

        float value9 = 10f;
        double resist1 = 49.56;
        System.out.println(value9);
        System.out.println(resist1);

    }
}
