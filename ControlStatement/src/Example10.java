// 복습 필요함

public class Example10 {
    public static void main(String[] args) {
        // 시작과 끝을 나타내는 정수를 매개변수로 받아서
        // 그 두개의 정수사이에 있는 숫자들을 모두 더하는 메서드
        // 시작과 끝을 나타내는 정수 모두 덧셈에 포함하세요.
        System.out.println(sumNumbers(1, 2)); // 3
        System.out.println(sumNumbers(1, 10)); // 55
        System.out.println(sumNumbers(12, 235)); // 27664
    }

    public static int sumNumbers(int x, int y) {
        int sum = 0;
        for (int i=x; i<=y; i++) {
            sum = sum + i;
        } return sum;



    /*public static int sumNumbers(int x, int y) {
        int sum = 0; // 맨 바닥 기초공사를 깔아주는 0. 저장소 설계.
        for (int i = x; i <= y; i++) {
            sum = sum + i; // sum = 0+1+2+3+4+...
        }
        return sum;*/
    }
}