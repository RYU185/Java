import java.sql.SQLOutput;
import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        int a = 2;                          //switch
        switch(a) {
            case 1:
                System.out.println("A");
                break; // break: 깬다. 중괄호를 깨다라는 의미로 받아들이자.
            // break가 없다면 연속적으로 실행이 가능하다
            // 범위같은 조건을 나타낼 수 없다.
            // case는 언제나 값
            case 2:
                System.out.println("B");
                break;
            case 3:
                System.out.println("C");
                break;
            default:
                System.out.println("D");
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("요일을 입력해주세요: ");
        String day = scanner.nextLine();
        switch (day) {
            case "월":
            case "월요일":
                System.out.println("오늘은 월요일입니다.");
                break;
            case "화":
            case "화요일":
                System.out.println("오늘은 화요일입니다.");
                break;
            case "수":
            case "수요일":
                System.out.println("오늘은 수요일입니다");
                break;
            case "목":
            case "목요일":
                System.out.println("오늘은 목요일입니다.");
                break;
            case "금":
            case "금요일":
                System.out.println("오늘은 금요일입니다.");
                break;
            case "토":
            case "토요일":
                System.out.println("오늘은 토요일입니다.");
                break;
            case "일":
            case "일요일":
                System.out.println("오늘은 일요일입니다.");
                break;
            default:
                System.out.println("올바른 요일을 작성해주세요.");
                break;
        }
        scanner.close(); // 스캐너 객체를 메모리에서 삭제시킨다. 이 이후에 scanner.nextLine();을 작성해ㄴ도 실행되지않음
    }
}
