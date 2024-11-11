package Abstract;

//
abstract public class Vehicle {
    String model; // 차량의 모델명

    public Vehicle() {   // 기본생성자
    }
    // 추상클래스는 인스턴스를 만들 수 없지만
    // 생성자는 가질 수 있음
    // 자식 클래스에서 super()를 호출 할 수 있다.

    abstract void drive();
}

class Car extends Vehicle{
    public Car(){
        super();
    }
    @Override
    void drive() {
        System.out.println(model+"은 도로 위에서 달린다.");
    }
}
class Boat extends Vehicle{
    @Override
    void drive() {
        System.out.println(model+"은 물 위에서 달린다.");
    }
}