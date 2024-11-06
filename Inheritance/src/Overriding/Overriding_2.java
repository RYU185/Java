package Overriding;

class Animal {
    void cry(){
        System.out.println("...");
    }
}
// 자식 클래스 새, 고양이, 개

class Bird extends Animal{
    void cry(){
        System.out.println("짹짹");
    }
}
class Cat extends Animal{
    void cry(){
        System.out.println("야옹");
    }
}
class Dog extends Animal{
    void cry(){
        System.out.println("멍멍");
    }// 같은 이름의 메서드. 오버라이딩 발생
}


public class Overriding_2 {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Bird bird = new Bird();
        Cat cat = new Cat();
        Dog dog = new Dog();
        animal.cry();
        bird.cry();
        cat.cry();
        dog.cry();
        System.out.println();
        Animal animal1 = new Bird(); // Bird가 Animal로 업캐스팅
        Animal animal2 = new Cat();  // 업캐스팅
        Animal animal3 = new Dog(); // 업캐스팅
        animal1.cry(); // 짹짹
        animal2.cry(); // 야옹
        animal3.cry(); // 멍멍
        // Animal임에도 불구하고 오버라이딩에 의해 자식클래스의 메서드를 출력
        System.out.println();

        // 배열 생성
        // 부모클래스로 배열의 타입을 정의하면 자식클래스들 모두를 배열화할수 있음
        // 이게 상속의 가장 큰 장점
        Animal[] animals = {animal, bird, dog, cat, animal2, animal3};
        printCry(animals);

    }
    static void printCry(Animal[] animals){
        for(Animal animal : animals) {
            animal.cry();
        }
    }
}
