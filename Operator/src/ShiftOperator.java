public class ShiftOperator {
    public static void main(String[] args) {
        // 시프트연산자
        // 시프트 shift : 위치를 이동하다, 자리를 옮기다.
        System.out.println(3 << 1); // 6
        // 3 = 0000 .... 0000 0011
        // 여기서 << 방향으로 1칸씩 옮긴다
        // 부호비트는 유지
        // 0000 .... 0000 0110 = 6

        System.out.println(-3 << 1); // -6
        /* 계산과정
        -3을 2진수로
        = 1111 ... 1111 1101
        << 으로 시프트하면
        = 1111 ... 1111 1010 (=-6) *다시 역으로 계산해야하는데 이거까지는 아직 이르다.
        시프트가 어떤방식으로 이루어지는지만 이해할 것
        */
        System.out.println();
        // !!!중요!!!
        System.out.println(3 << 2); // 12
        System.out.println(-3 << 2); // -12
        System.out.println(3 << 3); // 24
        System.out.println(-3 << 3); // -24
        System.out.println(3 << 4); // 48
        System.out.println(-3 << 4); // -48
        // 규칙!
        // (x << y) x 곱하기 2^y
        // (x >> y) x 나누기 2^y
        // 모든 곱하기 나누기에 통하지는 않지만 대부분이 이 계산식을 따른다.

        // 음수 >> x 의 경우는 조금 다르다.
        System.out.println(5>>1); // 2
        System.out.println(-5>>1); // -3 (-를 붙이고 1씩 값이 작다. 왜? 부호비트(맨 앞자리)가 양수는 0이지만 음수는 1이 붙기 때문에.)
        System.out.println(5>>2); // 1
        System.out.println(-5>>2); // -2
        System.out.println(5>>3); // 0
        System.out.println(-5>>3); // -1
        System.out.println();



    }
}
