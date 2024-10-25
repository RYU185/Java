public class Method2 {
    public static void main(String[] args) {
        // (문제) 홀수인지 짝수인지 판단하는 메서드
        System.out.println(isOdd(33));
            }

    public static boolean isOdd(int number) {
        if(number%2==1){ //홀수일 경우
            return true; // 홀수면 true
        }else {
            return false; // 아니면(짝수면) false
        }
    }
}
