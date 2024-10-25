public class Example1 {
    public static void main(String[] args) {
        plus1(2, 5);

        plus2(2, 5); // 1. return 결과를 result 라는 변수에 담아서 사용하는 경우
        int result = plus2(2,5);
        System.out.println(result);
        System.out.println(plus2(2,5)); // 2. 직접 사용하는 경우

        // 만약 덧셈결과를 다음 계산에 사용하는 경우
        // 예) 2와 5를 더한 다음, 10을 곱하고 싶다
        // int value = plus1(2,5)*10; // plus1으로는 불가능.
        int value = plus2(2,5)*10;
        System.out.println(value);
        // 결론: 메서드의 확장성을 위해서는 return 타입을 지정하는 방식이 유리하다.
        // 아래 1번의 방식은 쓰임새가 제한적임. 왜? plus1은 void타입(값이 없음. 공허함)이기 때문에.
        plus2(4,5); // 리턴타입을 지정한 메서드라도 매개변수에서 sout을 출력해준다면 void형 메서드처럼 사용가능
        System.out.println(plus2(4,5));
        int x =plus2(4, 5);
        System.out.println(x *100);

    }
    // 1번. void + 매개변수 O
    public static void plus1(int a, int b)  { // void : 리턴이 없음
        System.out.println(a+b);
    }
    // 2번. 데이터타입 + 매개변수 O
    public static int plus2 (int a, int b) {
        int c = a+b;
        System.out.println(c);
        return c; // c라는 리턴값에 a+b를 할당하고 그 값을 plus2 자리에 대체함.

    }
}
