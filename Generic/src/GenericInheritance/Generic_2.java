package GenericInheritance;

// 제네릭 메서드의 상속
class Parent2 {
    public <T extends Number> void print(T t){
        System.out.println(t);
    }
}
class Child4 extends Parent2 {}

public class Generic_2 {
    public static void main(String[] args) {
        Parent2 p = new Parent2();
        p.<Integer>print(10);
        // 자식 클래스에서 부모 클래스의 제네릭 메서드 사용
        Child4 c = new Child4();
        c.<Double>print(5.8);
        c.print(5.8);

    }
}
