public class ForLoop {
    public static void main(String[] args) {
        // for ( 초기식 ; 조건식 ; 증감식 )
        //  System.out.println(i);

        //일반형 (10회 반복)
        for (int i = 0; i < 10; i++) { // 컴퓨터는 0부터 센다 (0~9)
            System.out.print(i + " ");
            //이 경우 System.out.println(i)으로 개행하는 것보다 가독성이 좋다. print와 println의 차이!
        }
        System.out.println("끝");
        //  1. i가 0에서 시작함 > 출력
        //  2. i++
        //  3. 조건식 확인 (i(1)<10) 만족
        //  4. 출력
        //  5. i++
        //  6. 조건식 확인 (i(2)<10) 만족
        //  7. 반복...
        //  ...
        //  8. i++
        //  9. 조건식 확인 (i(10)<10) 거짓
        // 10. for문을 빠져나옴 "끝" 출력.

        // 감소형
        for (int i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println("연산 완료");


        // 증감식의 변화 (2씩 증가)
        for (int i = 0; i < 10; i = i + 2) { // 0, 2, 4, 6, 8 (5회 반복)
            System.out.print(i + " ");
        }
        System.out.println("끝");

        // iterator(반복자)가 여러개인 경우
        for (int i = 0, j = 0; i < 10; i++, j = j + 2) {
            System.out.print(i + " " + j + " ");
        }
        System.out.println("끝");


        // 무한루프 : 조건식이 없거나, 조건식이 거짓이 될 수 없는 경우
        // 루프는 무한히 계속된다!
        // 1번
        int count = 0;
        for (int i = 0; ; i++) {     // 조건식이 없음.
            System.out.println(i);
            count = i;
            if (count > 100000) {
                break;
            } // i가 100000을 초과할때 for문 탈출

        }
        // 2번
//        for (int i=0; i>=0; i++) {   // 조건식에서 거짓이 나올 가능성이 없음.
//            System.out.println(i);
//        }
        // 똑같은 무한루프지만 조건식을 없애는 방식으로 무한루프를 만드는 것이 맞다.
        //System.out.println("끝");

//        for( ; ; ) {
        // 무한루프
//    }  초기식 조건식 증감식 모두를 비워버려도 무한루프가 성립됨
    }
}
