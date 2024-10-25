public class WhileLoop {
    public static void main(String[] args) {
        // while 반복문
        /*for (int i=0; i<10; i++)
         *    (초기식); (조건식); (증감식)
         *
         * int i =0;
         * while(i<10) {
         * (실행코드)
         * (증감식이 실행코드에 내포되어 있기 때문에 잘못 작성하거나 잊고 작성하지 않는 경우가 많음. 주의!!)
         * 무한루프를 구현할 때 사용함
         * For문에 비해 구조가 안정적이지 못함 */

        int i = 0;
        while(i<10){
            System.out.println(i);
            i++; // 증감식이 있는지 확인해야함!!
        }

        // do while 반복문

        int a = 0;
        do {
            System.out.println(a);
            a++; // 증감식
        } while(a<10);



        // while문과 do while문의 차이점
        // 조건식이 처음부터 false인 경우, while문은 코드가 실행되지 않으나.\,
        // do~while문은 1회 실행됨. 실행코드가 더 위에 있기 때문!!
        a = 0;
        do {
            System.out.println(a);
            a++; // 증감식
        } while(false);
    }
}
