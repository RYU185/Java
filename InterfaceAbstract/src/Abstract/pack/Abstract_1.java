package Abstract.pack;

class Animal {
    void cry(){}
}

class Cat extends Animal{}
class Dog extends Animal{}

// 일반 클래스의 상속
// 1. 부모 클래스인 Animal의 인스턴스화 가능
// 2. 자식 클래스인 Cat과 Dog가 cry 메서드를 오버라이드를 하지않아도 문제가 없다.
// 3. 강제성이 없다 = 오버라이드가 되지 않았다.

public class Abstract_1 {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal animal1 = new Cat();
        Animal animal2 = new Dog();
    }
}
