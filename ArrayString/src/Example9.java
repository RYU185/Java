import java.sql.Array;
import java.util.Arrays;

public class Example9 {
    public static void main(String[] args) {
        // 배열에 포함된 짝수만 리턴하는 메서드
        int[] numbers1 = {64, 55, 95, 34, 41, 15, 11, 70, 2, 62};
        int[] numbers2 = {17, 92, 78, 6, 1, 52, 60, 28, 98, 16};
        int[] numbers3 = {12, 19, 86, 44, 40, 80, 71, 99, 85, 86};
        System.out.println(Arrays.toString(collectEvenNumber(numbers1)));
        System.out.println(Arrays.toString(collectEvenNumber(numbers2)));
        System.out.println(Arrays.toString(collectEvenNumber(numbers3)));
    }
    public static int[] collectEvenNumber(int[] array1) {
        int[] evenNumber = new int[array1.length];
        int j = 0;
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] % 2 == 0) {
                evenNumber[j] = array1[i];  // if문과 for문을 반복하고 for문이 끝나면
                j++; // j = j + 1           // j가 곧 짝수의 갯수가 됨
            }
        }
        // 짝수만 존재하는 배열을 하려면?
        int[] evenArray = new int[j]; // 짝수의 갯수만큼 배열을 다시 만들어줘야 함
        for (int i = 0; i < j; i++) {
            return evenArray[i] = 
        }
    }
}