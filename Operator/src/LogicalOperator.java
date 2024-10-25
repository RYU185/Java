public class LogicalOperator {
    public static void main(String[] args) {

        // 논리연산자 ( &&, ||, ^, ! )
        // AND (&&) : 둘 모두 true여야 true
        System.out.println(true && true); // true
        System.out.println(true && false); // false
        System.out.println(true && (5<3)); // false
        System.out.println((5<=5) && (7>2)); // true
        System.out.println();

        //OR (||) : 둘 중에 하나라도 true면 true
        System.out.println(true || true); // true
        System.out.println(true || false); // true
        System.out.println(false || (5<3)); // false
        System.out.println((5<=5) || (7>2)); // true
        System.out.println();

        // XOR ( ^ ) *비트연산자에서 사용 : 서로 다른 값이어야 true
        System.out.println(true ^ true); // false
        System.out.println(true ^ false); // true
        System.out.println(false ^ (5<3)); // false
        System.out.println((5<=5) ^ (7>2)); // false
        System.out.println();

        // NOT( ! ) : 현재 변수의 반댓값
        System.out.println(!true); // false
        System.out.println(!false); // true
        System.out.println(!false || !(5<3)); // true or true(not false) 이므로 true
        System.out.println((5<=5) || !(7>2)); // true or false(not true) 이므로 true
        System.out.println();

        // 쇼트 서킷
        // 자바의 읽기 순서에 따라 왼쪽에서 먼저 결과값이 확정되었을 때 그 뒤의 변수는 읽지않는다.
        int value1 = 3;
        System.out.println(false && ++value1>6); // true 였으면 쇼트 서킷이 발생하지 않고 뒤까지 읽음
        System.out.println(value1); // 3 쇼트서킷이 발생하여 ++value1이 실행되지 않은 채로 출력함

    }
}
