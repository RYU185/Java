import java.util.Arrays;

public class Array3 {
    public static void main(String[] args) {
        // 값 복사
        // 기본 자료형의 값 복사
        int a = 4;
        int b = a;
        System.out.println(b); // 4
        b = 10;
        System.out.println(a); // 4
        System.out.println(b); // 10

        // 참조 자료형의 값 복사
        int[] ints = {1,2,3};
        int[] temps = ints;
        temps[0] = 100;
        System.out.println(Arrays.toString(ints));  // [100, 2, 3]
        System.out.println(Arrays.toString(temps)); // [100, 2, 3]

    }
}
