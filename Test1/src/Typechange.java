public class Typechange {
    public static void main(String[] args) {
        // type을 변환시키는 행위 = casting
        int value1 = (int)5.3;
        System.out.println(value1);
        // 소수를 표현하는 double이 정수를 표현하는 int로 변환(down-casting)되면 소수점 이하는 날려버림. 반올림.
        long value2 = (long)10;
        // == long value2 = 10L;
        float value3 = (float) 4.1;
        // == float value3 = 4.1F;
        double value4 = (double) 16;
        System.out.println(value4); // 출력값 16.0

        // type byte의 저장 범위가 큰 것에서 작은 것으로 변환 = down-casting
        // type byte의 저장 범위가 작은 것에서 큰 것으로 변환 = up-casting


        final float HELLO;


    }
}
