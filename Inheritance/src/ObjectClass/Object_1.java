package ObjectClass;

class Myclass extends Object {} // extends Object는 생략해도 자동생성

public class Object_1 {
    public static void main(String[] args) {
        Myclass myClass = new Myclass();
        // 모든 클래스는 Object 클래스의 자식이다
        // Object가 가지고 있는 메서드를 모두 사용할 수 있다 (오버라이딩 또한 가능하다)
        System.out.println(myClass.toString());  //ObjectClass.Myclass@2f4d3709 (hashcode)
        System.out.println(myClass); // toString을 달아주지 않아도 결과값은 같다. 기본적으로 toString을 갖고있음

    }
}
