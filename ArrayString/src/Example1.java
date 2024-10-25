public class Example1 {
    public static void main(String[] args) {
        // 랜덤한 정수 10개를 가진 배열에서 특정한 값을 찾고
        // 그 위치 인덱스값을 리턴하는 메서드
        // 만약 못찾으면 -1 리턴
        int[] numbers = {37, 82, 14, 56, 91, 23, 48, 65, 8, 74};
        System.out.println(findNumber(numbers,91)); // 4
        System.out.println(findNumber(numbers,65)); // 7
        System.out.println(findNumber(numbers,100)); // -1
  }

//   public static int findNumber(int[] numbers, int target) {
//        for (int i=0; i<numbers.length; i++){  // i를 찾자
//            if (numbers[i] == target) { // numbers[i] : i가 0일땐 37, i가 1일땐 82, .....
//                return i;   // 찾았을 경우에는 index를 리턴
//            }
//        } return -1;   // 못찾았을 경우에는 반복문이 종료된 이후에 리턴 -1


    // for - each문 사용
    public static int findNumber(int[] numbers, int target){
        int index = 0;
        for (int data : numbers){ // 배열안에 있는 data라는 명시적인 이름
            if (data == target){
                return index;
            } index = index + 1;  // 위치값을 증감해주는 증감식 넣어주기 중요함.
        } return -1;
    }
}
