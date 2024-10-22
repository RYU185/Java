public class Example6 {
    public static void main(String[] args) {
        // 두 문자열이 같은지 비교하는 메서드
        String str1 = "hello";
        String str2 = "hello";
        String str3 = "world";
        System.out.println(str1.equals(str2)); // 참조자료형 String의 값으로서의 변수를 비교하기 위하
        System.out.println(str1.equals(str3));

        // 메서드 사용
        // 아래 코드가 동작하도록 메서드를 정의하시오
        System.out.println(sareEqual("test", "test")); // true 출력
        System.out.println(sareEqual("hello", "world")); // false 출력
    }

    public static boolean sareEqual(String str1, String str2) {
//        if (str1.equals(str2)) {
//            return (true);
//        } else return (false); // 이미 equals에서 결과값이 true, false로 처리되므로 결과값을 더 써줄 필요가 없음.
    return str1.equals(str2);
    }

}
