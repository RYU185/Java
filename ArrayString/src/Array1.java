import java.util.Arrays;

public class Array1 {
    public static void main(String[] args) {
        // 배열의 선언 (기본!)
        int[] array1 = new int[3]; // int형 자료 3개를 힙 영역에
    // 데이터타입 이름 = new int타입 [갯수]
        double[] array2;
        array2 = new double[5];
        String [] array3 = new String [10]; // 참조 자료형도 배열을 만들 수 있다.

        // 배열에 값을 대입하는 방법
        array1[0] = 1; // [0]을 0번 index라고 부름 or index0
        array1[1] = 2; // [1]을 1번 index라고 부름 or index1
        array1[2] = 3; // [2]를 2번 index라고 부름 or index2
        // 읽는법: "array1의 0번 인덱스 값은 1"
        System.out.println(array1[0] + " " + array1 [1] + " " + array1[2]);
        System.out.println(Arrays.toString(array1));
        array3[0] = "첫번째";
        array3[1] = "두번째";
        array3[2] = "세번째";
        array3[3] = "네번째";
        // 참조자료형의 경우,
        System.out.println(Arrays.toString(array3)); // [첫번째, 두번째, 세번째, 네번째, null, null, null, null, null, null]
        // null : 비어있다. 힙에만 생김 : 스택은 힙의 주소를 불러오기 때문에.

        // int형의 배열 생성과 값 대입
        // 배열 변수의 이름은 영어단어의 복수형으로 사용하는 것이 일반적이다. (numbers)
        int[] numbers = new int[3];
        numbers[0]=10;
        numbers[1]=20;
        System.out.println(Arrays.toString(numbers)); //[10, 20, 0]
        // 기본(원시) 자료형의 경우,
        // 힙에 메모리 공간을 만들고 값을 대입하지 않으면 자료형에 맞는 초기값이 자동으로 들어감
        // 초기값 (0(정수), 0.0(실수), false(boolean), 널문자(char))

        double[] doubles = new double[1];
        boolean[] booleans = new boolean [1];
        char [] chars = new char [1];
        System.out.println(doubles[0]); // 0.0
        System.out.println(booleans[0]); // false
        System.out.println(chars[0]); // 널문자



    }
}
