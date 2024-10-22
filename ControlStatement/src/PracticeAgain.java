import java.util.Scanner;

public class PracticeAgain {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("현재 온도를 기입하시오: ");
        int temp = scanner.nextInt();

        if (temp <= 0) {
            System.out.println("영하입니다. 미끄럼길을 주의하세요.");
        } else if (temp < 10 && temp > 0) {
            System.out.println("날씨가 매우 쌀쌀합니다. 따뜻한 겉옷을 챙겨 나가세요.");
        } else if (temp > 10 && temp < 20) {
            System.out.println("날씨가 선선합니다. 산책에 어울리는 날입니다.");
        } else if (temp > 20 && temp < 30) {
            System.out.println("꽤 따뜻한 날씨입니다.");
        } else if (temp > 30) {
            System.out.println("날이 뜨겁습니다. 충분한 물을 구비하세요.");
        }
    }
}
