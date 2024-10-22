public class RelationOperator {
    public static void main(String[] args) {
        // 비교연산자
        System.out.println(5<2); // false
        System.out.println(5>2); // true
        System.out.println(5<5); // false
        System.out.println(5<=5); // true
        System.out.println(5>=5); // true
        System.out.println();

        //등가비교
        int a = 5;
        int b = 2;
        int c = 5;
        System.out.println(a==b); // false
        System.out.println(a!=b); // true
        System.out.println(a==c); // true
        System.out.println(a!=c); // false
        System.out.println();

        //중요!! 참조자료형의 참조비교
        String str1 = new String("안녕"); // new: 힙에 메모리를 만들어달라는 요청. 참조형 데이터 타입에만 사용.
        String str2 = new String("안녕"); // 데이터 타입을 명시하고 "안녕"
                                                // 이전 String str1 = "안녕"과는 차이가 있음 ( line 30.에서 설명 )
                                                // false가 나오는 이유 : 힙에 할당된 "안녕"을 비교한 것이 아니라 스택에 위치한 참조 주소를 비교한 것임
                                                // 당연히 주소가 다른 곳에 할당되어 있으므로 false가 나옴
        System.out.println(str1 == str2);
        System.out.println();

        // 리터럴 방식의 문자열 생성과 비교 //JVM이 메모리를 효율적으로 관리하는 방식 중 하나: 리터럴(자주 쓰이는 문자열) 방식
        String str3 = "안녕";
        String str4 = "안녕";
        System.out.println(str3 == str4); // true인 이유: 리터럴 영역에서의 "안녕"의 주소를 str3과 str4가 공유한다
        System.out.println();

        // 참조값의 복사후 비교
        String str5 = new String("안녕");
        String str6 = str5;
        System.out.println(str5 == str6);



    }
}
