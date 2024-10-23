public class Overlap {
    public static void main(String[] args) {
        // 제어문의 중복
        // if의 중복
        int value1 = 5;
        int value2 = 3;
        if (value1 > 4) { // value1 > 4와 13ln의 else중 택1. 참이라면 else는 출력될 가능성이 없어짐.
            if (value2 > 2){
                System.out.println("실행1");
            }else {
                System.out.println("실행2");
            }
        }else {
            System.out.println("실행3");
        }

        // for 중복 (= 이중for문)
        for (int i=0; i<3; i++){
            for(int j=0; j<5; j++){
                System.out.println("i=" + i +", j=" + j ); // i = 0, j = 0
            }
        }
    }
}
