package P1031;

public class ConstructorThis {
    public static void main(String[] args) {
        E1 e1 = new E1(3,5);
        e1.print();
        // 클래스의 필드와 메서드의 지역변수가 같으면 필드를 지역변수로 인식하므로
        // 명시적으로 this를 사용하여 필드를 표시해야함. (this.필드)

        E2 e2 = new E2();
        e2.print(); //  1 2 3 4
        E2 e2_1 = new E2(10);
        e2_1.print(); // 10 2 3 4
        // this(); 를 실행하지 않는다면 10 0 0 0
        E2 e2_2 = new E2(20, 30);
        e2_2.print(); // 20 30 3 4

    }
}

class E1 {
    int m;
    int n;  // 변수
    E1(int m, int n){
        m = m;   // 초기화
        this.n = n;
    }
    void print(){
        System.out.println(m+" , "+n);
    }
}

class E2 {
    int m1;
    int m2;
    int m3;
    int m4;
    E2(){  // 기본생성자
        this.m1 =1;
        this.m2 =2;
        this.m3 =3;
        this.m4 =4; // int m1~m4의 초기값을 변경
    }
    E2(int m1) {
        this();  // this를 메서드로 사용: this메서드 >> 생성자 그 자신을 뜻함 = E2
        this.m1 = m1;
    }
    E2(int m1, int m2){
        this(m1);
        this.m2 = m2;
    }

    void print(){
        System.out.println(m1+" "+m2+" "+m3+" "+m4);
    }
}