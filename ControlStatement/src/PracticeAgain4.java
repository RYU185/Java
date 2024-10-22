import java.util.Scanner;

public class PracticeAgain4 {
    public static void main(String[] args) {

        System.out.println(square());
    }
    public static int square() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("숫자를 입력하세요: ");
        int num = scanner.nextInt();
        return num * num;
    }
}
