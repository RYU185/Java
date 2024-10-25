import java.nio.file.attribute.UserDefinedFileAttributeView;

public class String2 {
    public static void main(String[] args) {
        // #1. 문자열 길이 length
        String str1 = "Hello Java!";
        String str2 = "안녕하세요! 반갑습니다.";
        System.out.println(str1.length()); // 11
        System.out.println(str2.length()); // 13

        // #2. 문자열 검색 charAt(), indexOf)(), lastIndexOf()
        System.out.println(str1.charAt(1)); // e
        System.out.println(str2.charAt(1)); // 녕
        System.out.println();
        System.out.println(str1.indexOf('a')); // 7
        System.out.println(str1.lastIndexOf('a')); // 9 // 마지막 끝순서에서부터 세기 세작함.
        System.out.println(str1.indexOf( 'a', 8)); // 9
        System.out.println(str1.lastIndexOf('a',8)); // 7
        System.out.println(str1.indexOf("Java")); // 6 , 못찾았을 경우 대소문자를 구분함
        System.out.println();

        // 3# 문자열의 반환 및 연결 valueOf(). concat()
        String str3 = String.valueOf(2.3) ; // double >> String 변환
        String str4 = String.valueOf(false); // boolean > String 변환
        System.out.println(2.3); // "2.3"
        System.out.println(str4); // "false"
        }
}
