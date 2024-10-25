public class MainArg {
    public static void main(String[] args) { //main은 메서드다. 그런데 이제 직접 호출하지 않는.
        // main 메서드의 매개변수를 활용하는 방법
        // (인텔리제이) 오른쪽 위의 ...버튼 클릭
        // Run with paratmeter(매개변수) 클릭
        // Program argument 창에 매개변수를 차례로 입력
        // 입력시 ' '(스페이스)로 나눌 수 있음.
        System.out.println(args.length); // 4
        System.out.println(args[0]); // hello
        System.out.println(args[1]); // 100
        System.out.println(args[2]); // true
        System.out.println(args[3]); // 3.14
    }
}
