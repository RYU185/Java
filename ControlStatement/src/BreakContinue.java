public class BreakContinue {
    public static void main(String[] args) {
        // break문
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.print(i); // 0, 1, 2, 3, 4까지 돌리고 break
        }
        System.out.println();

        // 이중For문의 break
        for (int i = 0; i < 3; i++) { // 3번 반복
            for (int j = 0; j < 5; j++) { // 5번 반복
                if (j == 2) {
                    break;
                }
                System.out.println("i=" + i + ", j=" + j); // i = 0, j = 0
            }
        }

        // 이중 for문에서 바깥 for문까지 한번에 탈출하려면?
        for (int i = 0; i < 3; i++) { // 3번 반복
            for (int j = 0; j < 5; j++) { // 5번 반복
                if (j == 2) {
                    i = 999999; // 999999는 의미없는 숫자. 가독성을 위해 3보다 매우 큰 수로. 누가봐도 수상한 큰 수.
                    // j가 2가 된순간 i를 100으로.
                    // 자연스럽게 바깥 for문까지 탈출할수 있음
                    break;
                }
                System.out.println("i=" + i + ", j=" + j); // i = 0, j = 0
            }
            System.out.println();
        }


        // continue ( 얘 빼고는 다 실행 = 조건식 중 continue가 달린 조건은 건너뛰고 나머지는 모두 진행)
        for (int i = 0; i < 3; i++) { // 3번 반복
            for (int j = 0; j < 4; j++) { // 5번 반복
                if (j == 2) {
                    continue; // j == 2 인 경우만 제외한다.
                }
                System.out.println(i + "," + j);
            }
        }
    }
}
