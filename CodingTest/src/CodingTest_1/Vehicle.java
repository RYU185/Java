package CodingTest_1;

abstract public class Vehicle {
    String modelName;
    int maxSpeed;

    public Vehicle(String modelName, int maxSpeed) {
        this.modelName = modelName;
        this.maxSpeed = maxSpeed;
    }
    abstract void drive();
    final void displayInfo(){
        System.out.println("Model: "+modelName+", maxSpeep: "+maxSpeed);
    }
}

class Car extends Vehicle {
    int seatingCapacity;

    public Car(String modelName, int maxSpeed, int seatingCapacity) {
        super(modelName, maxSpeed);
        this.seatingCapacity = seatingCapacity;
    }

    @Override
    void drive() {
        System.out.println("도로에서 운전 중입니다.");
    }
    void airConditioning(){
        System.out.println("에어컨이 작동합니다.");
    }
}
