package P1029;

public class Student {
    // #1. 필드
    String name;
    int age;
    String address;
    String gender;
    double scoreMath;
    double scoreHistory;
    double scoreMusic;

    // #2. 생성자 : 필드영역을 초기화하는 역할
    // 기본 생성자
    public Student() {
        //new Student ("Steve", 25, "Daejeon", "남")
        //new Student ("Steve", 25, "Daejeon", "남", 100, 100, 100);

    }


    // 매개변수를 가진 생성자 (생성자는 리턴타입이 없다 = 애초부터 리턴이 없다.)
    public Student(String name, int age) {
        this.name = name;
        this.age = age;

    }



    public Student(String name, int age, String gender){
        this.name = name;  // 앞에 name은 필드, 뒤에 name은 매개변수 , this는 현재 클래스라고 명시
        this.age = age;
        this.gender= gender;

    }
    // 생성자와 메서드의 차이점
    // 1) 목적: 생성자는 필드의 초기화. 메서드는 각종 기능의 구현.
    // 2) 이름: 생성자는 클래스와 동일한 이름. 메서드는 자유롭게 작명(주로 동사로 시작)
    // 3) 반환형: 생성자는 반환형(리턴) 없음. 메서드는 반드시 명시 (void, int, String 등)
    // 인텔리제이는 자동으로 생성자를 만들어주는 기능을 지원함

    // 우클릭 - Generate - Constructor - 원하는 필드선택 - Ok

    public Student(String name, int age, String gender, String address, double scoreMath, double scoreHistory, double scoreMusic) {
        this.gender = gender;
        this.name = name;
        this.age = age;
        this.address = address;
        this.scoreMath = scoreMath;
        this.scoreHistory = scoreHistory;
        this.scoreMusic = scoreMusic;
    }
    // #3. 메서드
    // sumScore : 점수의 합계를 리턴하는 메서드
    public double sumScore(){ // 매개변수가 필요없음
        double sum = 0;
        sum = this.scoreMath + this.scoreMusic + this.scoreMath;
        //실행코드
        return sum;
    }
}
