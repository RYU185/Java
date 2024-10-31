package P1031;

public class Constructor2 {
    // 생성자의 오버로딩 (p.239)
    // 이름이 같지만 기능(실행코드 영역)이 다른 메서드
    public static void main(String[] args) {
        AA a1 = new AA();
        AA a2 = new AA(3);
        AA a3 = new AA(26,58);
        AA a4 = new AA("Hello");
        System.out.println(a2.a);  // 0
        System.out.println(a4.a);  // 0
        // 필드 a가 생성자에 의해 초기화 되지 못하였음.
        // 이유: 생성자 내의 필드와 매개변수의 이름이 같으면
        // 필드에 this를 명시적으로 사용해야 한다.
        // 명시적인 표현이 없으면 자바는 지역변수 a로 판단함
        // a  = a;

    }
}

class AA {
    int a;
    int b;
    String str;
    // 생성자의 오버로딩
    // 생성자의 이름은 같고 매개변수의 갯수가 다름 (서로 오버로딩 관계다)
    AA(){
        System.out.println("기본생성자");

    }
    AA(int a){
        a=a;
        System.out.println("매개변수 1개 int");
    }
    AA(int a, int b){
        a=a;
        b=b;
        System.out.println("매개변수 2개");
    }
    AA(String str){ // 매개변수의 타입이 달라도 오버로딩이 성립될수 있다.
        str = str;
        System.out.println("매개변수 1개 문자열");
    }
}
