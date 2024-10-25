// 복습 필요함

import java.util.Scanner;
public class Example9 {
    public static void main(String[] args) {
        // 입력받은 숫자의 제곱을 리턴하는 메서드
        System.out.println(square());
    }
    public static int square() { // 메소드 만들기
        Scanner scanner = new Scanner(System.in); // 스캐너 시작 메모리 비워주기
        System.out.println("숫자를 입력해주세요: "); // 스캐너 제목 표시
        int number = scanner.nextInt();// 스캐너가 스캔하여 내보낼 데이터타입
        scanner.close();
        return number * number;
    }
}