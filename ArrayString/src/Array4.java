public class Array4 {
    public static void main(String[] args) {
        // 배열의 길이
        // 배열은 동일한 데이터 타입, 생성 크기, 순서가 중요하다
        int [] numbers = {3,4,5,6,7};
        System.out.println("배열의 길이  :  " + numbers.length);

        // 배열의 출력 (반복문 사용1)
        for (int i=0; i<numbers.length; i++) { // 왜 '미만' 인가? 컴퓨터는 0부터 세기때문에 0, 1, 2, 3, 4.
            System.out.println(numbers[i]);
        }

        // 배열의 출력 (반복문 사용 2)- for문의 간단 버전
        // 오직 배열과 컬렉션에만 사용이 가능하다!!! (for문의 오른쪽값)
        // 데이터 변수는 iterator(반복자)가 아니라 배열에서 순서대로 꺼낸 데이터임.

        for(int data : numbers) {
            System.out.println (data);
            //data는 반복문 안에서 순서대로 3, 4, 5, 6, 7
        }

        // 예제
        String[] colors = {"black", "white", "blue", "red", "green"};
        for(int i=0; i< colors.length; i++){
            System.out.println(colors[i]);        // 순서를 직관적으로 알 수 있다.
        }
        System.out.println();
        for(String data : colors) {
            System.out.println(data);            // 순서를 알 수 없다.
        }

        int count=0;
        for(String data : colors) {
               System.out.println(count + " : " + data);
               count = count+1;
            }
            // 간단한 버전의 for문(for-each문)은 인덱스값을 제공하지 않는다.
            // 필요하면 직접 추가해야 함.
        }
    }

