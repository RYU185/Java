public class AssignmentOperator {
    public static void main(String[] args) {
        // 대입연산자
        int value1 = 3;
        value1 = value1 + 3; // value1에 할당한 값에 3을 더한 값을 4ln의 value1에 덮어씌운다.
        System.out.println(value1); // 6
        System.out.println();

        int value2; // 변수의 선언부분
        value2 = 5; // 변수의 대입부분 assignment
        System.out.println(value2 += 2); // 축약형 : value2 = value2 + 2
        value2 = 5;
        System.out.println(value2 -= 2); // 축약형 : value2 = value2 - 2 // 3
        value2 = 5;
        System.out.println(value2 *= 2); // 10
        value2 = 5;
        System.out.println(value2 /= 2); // 2
        value2 = 5;
        System.out.println(value2 %= 2); // 1


    }
}
