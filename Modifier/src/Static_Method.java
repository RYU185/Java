public class Static_Method {
    public static void main(String[] args) {

    }
}

class A {
    int a; //인스턴스 필드
    static int b(); // 정적 필드
    void abc () {  // 인스턴스 필드
        a = 10;
        b = 20;
        System.out.println(a+ " " + b);
         }
}
