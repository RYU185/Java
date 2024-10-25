public class ForLoopPattern {
    // 1. sum. 반복문에서 합계를 저장하는 역할변수
    public static void main(String[] args) {
        int sum = 0;
        // i의 변화값을 모두 더하는 코드
        for (int i=0; i<=10; i++) {
            System.out.println("i = "+ i);
            sum = sum + i;
            System.out.println("sum = "+ sum);

            /* 0 + 0 = 0
            *  0 + 1 = 1
            *  1 + 2 = 3
            * */
        }
        System.out.println();
        // 2. count : 반복문에서 특정조건에 부합하는 경우를 세는 역할 변수
        int count = 0;
        for (int i=0; i<10; i++){
            System.out.println("i + "+ i);
            if (i % 2 == 0){
                count = count +1;
                System.out.println("count = " + count);
            }
        }
    }
}
