public class Summary {
    public static void main(String[] args) {
        /*1장
        * 고급언어: 인간이 이해하기 쉬운 문장 (ex.Java, C, C++)
        * 기계어: 2진데이터로 구성된 컴퓨터가 알아들을 수 있는 언어
        * 어셈블리어: 기계어와 1:1로 대응되는 언어

        * 자바의 플랫폼 독립성
        자바는 윈도우, 맥, 리눅스 등의 운영체제와 상관없이 모든 플랫폼에서 실행가능한 특성을 갖고 있다. 이를 플랫폼 독립성이라고 한다.
        <---> 플랫폼 종속성: 하나의 실행파일은 하나의 운영체제에서만 실행할 수 있다.

        JDK > JRE > JVM
        * JDK: Java Development Kit :자바 개발도구
        * JRE: Java Runtime Environment : 완성된 자바 프로그램을 실행시킬 수 있는 환경
        * JVM: Java Virtual Machine : 자바 가상머신


        */
        int value1;
        value1 = 10;

        String value2 = "Summary";
        System.out.println(value1+value2);
        System.out.println(value2+value1);
        System.out.println(value1+value2+"출력");
        System.out.println(5+value1+"홍길동"+value2);
        System.out.println();

        double a= 3.6;



    }
}
