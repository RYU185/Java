public class LogicalOperator {
    public static void main(String[] args) {

        // 논리연산자 ( &&, ||, ^, ! )
        // AND (&&)
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(true && (5<3));
        System.out.println((5<=5) && (7>2));
        System.out.println();

        //OR (||)
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || (5<3));
        System.out.println((5<=5) || (7>2));
        System.out.println();

        // XOR ( ^ ) *비트연산자에서 사용
        System.out.println(true ^ true);
        System.out.println(true ^ false);
        System.out.println(false ^ (5<3));
        System.out.println((5<=5) ^ (7>2));
        System.out.println();

        // NOT( ! )
        System.out.println(!true);
        System.out.println(!false);
        System.out.println(!false || !(5<3));
        System.out.println((5<=5) || !(7>2)); // 쇼트 서킷
        System.out.println();

        // 쇼트 서킷
        int value1 = 3;
        System.out.println(false && ++value1>6);
        System.out.println(value1); // 3 쇼트서킷이 발생하여 ++value1 실행되지않음

    }
}
