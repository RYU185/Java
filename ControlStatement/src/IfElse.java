import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // 스캐너 Scanner. 인풋을 터미널에서 받는다. Scanner(System.in)
        //데이터타입 Scanner는 자동완성으로
        System.out.println("나이를 입력해주세요: "); // 참조형 자료는 반드시 앞에 new가 붙는다! (String은 예외)
        int userAge = scanner.nextInt(); // 터미널창에서 입력을 대기함. Enter가 눌릴때까지.


        if (userAge > 20 && userAge <= 30) {
        System.out.println("20대");
    }else if (userAge > 30 && userAge <=40) {
        System.out.println("30대");
    }else if (userAge > 40 && userAge <=50) {
            System.out.println("40대");
        } else {
        System.out.println("나머지");
        }

        scanner.nextLine(); // Scanner가 가지고 있는 "엔터" 버퍼를 비워줘야함.
        // 위의 스캐너가 엔터도 문자열로 인식함.
        // nextLine : 줄을 바꾸며 터미널창에서 입력을 대기함

        System.out.println("이름을 입력해주세요: ");
        String userName = scanner.nextLine();
        System.out.println(userName);
        System.out.println("끝");

    }

    }

