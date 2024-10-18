public class ConditionalOperator {
    public static void main(String[] args) {
        // 삼항연산자 p105
        // 다른 연산자들과 다르게 그 자체로 하나의 완성된 명령문으로 치환된다.
        // 연산자라기보다는 조건식에 가깝다.
        int value1 = (3>5) ? 6:9;
        System.out.println(value1); // 9
        // if 조건문으로 변환
        if (3>5) {
            value1 = 6;
            System.out.println(value1);
        }else {
            value1 = 9;
            System.out.println(value1);
        }

        int value2 = (5>3)?10:20;
        System.out.println(value2); // 10

        int value3 = 3;
        System.out.println((value3%2==0)? "짝수":"홀수");

        int x = 40;
        System.out.println((x>=60)? "안녕하세요":"반갑습니다");

        // if else 조건문의 형태 (삼항연산자와 같아보이지만 전혀 다른 코드)
        if (value3%2==0) {
            System.out.println("짝수");
        }else {
            System.out.println("홀수");
         }
        // 만약(if) value3%2의 결과값이 0이라면(참이라면) "짝수"로 출력, 아니라면(거짓이면)(else) "홀수"로 출력.
        // if 조건문은 스스로가 "값"이 될수 없다. 그냥 문장일 뿐. 참과 거짓에 따른 긴 명령을 내리기에 적합하다.
        // 하지만 삼항연산자는 그 자체로 "값"이 치환될 수 있다. 쓸 수 있는 용도가 다양하다. 매우 간단한 조건을 표현하기에 적합함.


    }
}
