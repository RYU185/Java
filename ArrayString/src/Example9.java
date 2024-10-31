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
    public static int[] collectEvenNumber(int[] array1){
        int [] evenNumber = new int[array1.length];
        for (int i=0; i<=array1.length-1; i++){
            if (array1[i] % 2 == 0){
                evenNumber[i] = array1[i];
            }
        }
        return evenNumber;
    }

}