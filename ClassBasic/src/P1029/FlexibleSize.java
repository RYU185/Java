package P1029;

public class FlexibleSize { // 가변길이 배열 입력매개변수
    public static void main(String[] args) {
        // #1. method (int... value)
        method1(1, 2);
        method1(1,2,3,4);

        // 2. method2 (String... values
        method2("안녕","방가");
        method2("땡큐","베리","감사");
        method2();
    }


    public static void method1(int... values){ // int... : int[] x = {1,2}를 내부적으로 만들어내고, int[] values = x 로 전달
        for (int i=0; i<values.length; i++){
            System.out.print(values[i] + " ");
        }
        System.out.println();


    }
    public static void method2 (String... values) {
        for (int i = 0; i < values.length; i++) {
            System.out.print(values[i] + " ");
        }
        System.out.println();
    }
}
