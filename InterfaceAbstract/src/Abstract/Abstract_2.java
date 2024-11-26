package Abstract;

// 내부에 추상메서드가 한개라도 포함된 클래스에는
// 반드시 abstract 키워드를 클래스에 정의해야 한다.
// 보통 abstract은 메서드에 붙는다

abstract class Animal {
    abstract void cry();
    // Abstract methods cannot have a body
    // 추상 메서드는 본체(body)가 없다 ( = 중괄호{} 사용불가 )
    // 추상은 즉 미완성이라는 의미로 중괄호 없이 세미콜론; 으로 종결
    // 미완성이므로 반드시 cry 메서드를 오버라이드 해야한다는 강제성을 부여함
}

class Cat extends Animal {
    @Override
    void cry() {
        System.out.println("야옹");
    }
}
class Dog extends Animal {
    @Override
    void cry() {
        System.out.println("멍멍");
    }
}

// Class 'Cat' must either be declared abstract or implement abstract method 'cry()' in 'Animal'
// Cat, Dog 클래스 혹은 메서드를 추상으로 정의하거나 cry 메서드를 오버라이드하세요

public class Abstract_2 {
    public static void main(String[] args) {
        // 1. Animal 추상클래스는 인스턴스화 할 수 없다!
        
        // Animal animal = new Animal();  에러 발생
        Animal animal1 = new Cat();
        Animal animal2 = new Dog();
        animal1.cry();
        animal2.cry();
    }
}
