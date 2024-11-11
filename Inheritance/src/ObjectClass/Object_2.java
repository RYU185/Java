package ObjectClass;

class A{
    int a = 3;
    int b = 4;
}

class B {
    int a = 3;
    int b = 4;

    // 오브젝트 (Object가 클래스 B의 부모격이므로 오버라이드되서 B 클래스의 리턴값을 출력한다)
    @Override
    public String toString (){
        return "필드값(a,b) = "+a+", "+b;
    }

}



public class Object_2 {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        System.out.println(a);  //ObjectClass.A@4e50df2e
        System.out.println(b);  //필드값(a,b) = 3, 4
    }
}
