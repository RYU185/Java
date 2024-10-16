public class Variable2 {
    public static void main(String[] args) {
        // 정수형
        byte a = 1; // 1바이트
        short b = 128; // 2바이트
        int c = 1024; // 4바이트
        long d = 42651234; // 8바이트
        // 실수형
        float e = 3.5; // 4바이트 (오류 예시:자바는 소수점이 붙어있는 실수는 double로 판단함. float보다 double이 소수점 밑을 계산하는 정밀도가 높기때문에)
        float f = 3.5f; // f를 붙여 float이라는 것을 인식시킴
        double g = 3.5; // 8바이트
        // 문자형
        char h = 'A'; // 2바이트
        String i = "안녕하세요"; // 가변형( 문자열값마다 다름 )
        // 불리언형 (참,거짓)
        boolean j = true; // 1바이트







    }
}
