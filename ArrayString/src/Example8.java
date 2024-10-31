import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {
        // 사용자로부터 입력받은 문자열을 거꾸로 출력하는 메서드
        // 예) hello 를 입력하면 olleh 를 출력
        Scanner scanner = new Scanner(System.in);
        System.out.println("문자열을 입력해주세요.");
        String str = scanner.nextLine();
        System.out.println(reverseString(str));
    }
    public static String reverseString(String str) {
        char[] array1 = str.toCharArray();  // 문자열(hello)를 각각 하나의 문자들로 변환 (h,e,l,l,o)
        char[] array2 = new char[array1.length]; // h,e,l,l,o 가 들어갈 배열공간을 마련하자
        int j = array1.length-1; // j는 제시된 array1의 문자들(0,1,2,3,4 ...) 과 똑같으므로 길이-1
                for (int i=0;i<array1.length;i++){
                    array2[j] = array1[i];
                    j = j - 1;
                    // 0 4 /  1 3  /  2 2  /  3 1  / 4 0  순으로 교차
                }
        return String.valueOf(array2);
    }
}