package GenericMethod;

// 일반 클래스 안에도 제네릭 메서드를 사용 가능하다
class MyClass {
    // 제네릭 선언 <T> 위치 주의
    public <T> T method1 (T t){
        return t;
    }
    public <T> boolean method2 (T t1, T t2){
        return t1.equals(t2);
    }
    public <K,V> void method3 (K k, V v){
        System.out.println(k+" : "+v);
    }
}

public class GenericMethod_1 {
    public static void main(String[] args) {
        MyClass a = new MyClass();
        String str = a.<String>method1("Hello");
        String str2 = a.method1("안녕");
        // 컴파일러가 맨앞의 String으로 하여금 추정하여 주로 <String>은 생략하여 사용
        // 생략해도 주어진 정보만으로 컴파일 오류여부를 컴파일러가 판단 가능함

        boolean bool1 = a.method2(2.5,2.5);
        boolean bool2 = a.method2(3.9,6.9);

        a.<String, Integer>method3("국어",80);
        a.method3("국어", 80);



    }
}
