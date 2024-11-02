import java.nio.file.attribute.UserDefinedFileAttributeView;
import java.util.Arrays;

public class String2 {
    public static void main(String[] args) {
        // #1. 문자열 길이를 알고싶다 length
        String str1 = "Hello Java!";
        String str2 = "안녕하세요! 반갑습니다.";
        System.out.println(str1.length()); // 11
        System.out.println(str2.length()); // 13

        // #2. 문자열 중 원하는 문자를 검색하고싶다 charAt(), indexOf)(), lastIndexOf()
        System.out.println(str1.charAt(1)); // e
        System.out.println(str1.charAt(1));
        System.out.println(str2.charAt(1)); // 녕
        System.out.println();
        System.out.println(str1.indexOf('a')); // 7
        System.out.println(str1.lastIndexOf('a')); // 9 // 마지막 끝순서에서부터 세기 세작함.
        System.out.println(str1.indexOf( 'a', 8)); // 9
        System.out.println(str1.lastIndexOf('a',8)); // 7
        System.out.println(str1.indexOf("Java")); // 6 , 못찾았을 경우 대소문자를 구분함
        System.out.println();

        // #3 문자열의 반환 및 연결 valueOf():다른타입을 문자열(참조 자료형으로). concat():(2개의 문자열을 연결)
        String str3 = String.valueOf(2.3) ; // double >> String 변환
        String str4 = String.valueOf(false); // boolean > String 변환
        System.out.println(2.3); // "2.3"
        System.out.println(str4); // "false"
        System.out.println();


        String str5 = str3.concat(str4); //
        System.out.println(str5); // 2.3false
        String str6 = "안녕"+3; // 안녕3    >>> 자연스럽게 문자로 인식함 = 문자열 + int
        String str7 = "안녕".concat(String.valueOf(3)); // 안녕3 >>>> 문자열 + 문자(int를 참조 자료형으로 변환)
                        // "안녕" 은 그 자체로 하나의 문자열이므로 바로 .concat으로 들어갈 수 있다.
                        // .concat 의 ()안에는 반드시 String이 와야하므로 int를 String으로 바꾸는 valueOf를 사용

        // #4 문자열을 byte[]로, 또는 문자열을 char[]로 바꾸는 방법
        // byte array는 UTF-8 문자만 담는데 이용됨, 한글은 최소 2바이트가 필요.
        // 1byte안에 한글이 담기지 않기 때문에 음수로 보이게 됨 (데이터는 순환형이기때문에) - 한글은 UTF-16 이상이어야 함
        String str8="Hello Java!";
        String str9="안녕하세요";
        String str10="Java Education";
        byte[] array1 = str8.getBytes();
        byte[] array2 = str9.getBytes();
        byte[] array3 = str10.getBytes();
        System.out.println(Arrays.toString(array1)); // [72, 101, 108, 108, 111, 32, 74, 97, 118, 97, 33]
        System.out.println(Arrays.toString(array2)); // [-20, -107, -120, -21, -123, -107, -19, -107, -104, -20, -124, -72, -20, -102, -108]
        System.out.println(Arrays.toString(array3)); // [74, 97, 118, 97, 32, 69, 100, 117, 99, 97, 116, 105, 111, 110]

            // toCharArray() ( char는 2byte이므로 문자가 담긴다 (한글 포함) )
            char[] array4 = str8.toCharArray();
            char[] array5 = str9.toCharArray();
        System.out.println(Arrays.toString(array4)); // [H, e, l, l, o,  , J, a, v, a, !]
        System.out.println(Arrays.toString(array5)); // [안, 녕, 하, 세, 요]




        }


}
