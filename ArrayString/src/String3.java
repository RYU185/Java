import java.util.Arrays;

public class String3 {
    public static void main(String[] args) {
        // #5 문자열 수정
        // 대소문자 변경 toLowerCase, toUpperCase
        String str1 = "Java Study";
        System.out.println(str1.toLowerCase()); // java study
        System.out.println(str1.toUpperCase()); // JAVA STUDY

        // replace 문자열 교체
        System.out.println(str1.replace("Study", "공부"));

        // substring 문자열 조작
        System.out.println(str1.substring(0,5)); // Java (시작은 포함, 끝은 미만)
        String text = "2024-10-28";
        String year = text.substring(0,4);
        String month = text.substring(5,7);
        String day = text.substring(8);
        System.out.println(year); // 2024
        System.out.println(month); // 10
        System.out.println(day); // 28

        // 확장자 검색
        String filename = "document.pdf";
        String extension = filename.substring(filename.lastIndexOf(".")+1);
        System.out.println(extension);

        // spilt
        String[] strArray = "abc/def-ghi jkl".split("/|-| "); // regex 정규표현식 (regular expression)
                                                            // 순서랑 상관없음
        System.out.println(Arrays.toString(strArray)); // [abc, def, ghi, jkl]

        // 정규표현식 (regex, regular expression)
        // 특정패턴을 가진 문자열을 찾거나 조작하기 위한 문자열
        // 주로 문자열 검색, 추출, 치환과 같은 작업에 사용됨.
        // 정규표현식을 통해 특정 패턴을 효율적으로 찾고 원하는 부분을 추출, 변경 가능함.

        // trim 공백제거
        System.out.println("       abc       ".trim()); // abc
        System.out.println("       a  b  c       ".trim()); // a  b  c > 문자 사이에 있는 공백은 제거X

        // #6 문자열의 내용 비교
        String str2 = new String("Java");
        String str3 = new String("Java");
        String str4 = new String("java");
        System.out.println(str2 == str3); // false
        System.out.println(str3 == str4); // false  // 똑같은 문자열이라할지라도 주소값이 전부 다 다름
        System.out.println(str2.equals(str3));  // true
        System.out.println(str3.equals(str4));  // false
        System.out.println(str3.equalsIgnoreCase(str4)); // case(대소문자)를 무시하고 비교하라


    }
}
