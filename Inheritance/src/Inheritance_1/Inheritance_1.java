package Inheritance_1;
// 상속
class Human {
    //필드
    String name;
    int age;
    void eat(){};
    void sleep(){};

}

class Student extends Human{
    int studentID;
    void goToSchool(){}
}
class Worker extends Human{
    int workerID;
    void goToWork(){}
}
public class Inheritance_1 {
    public static void main(String[] args) {
        // 1. Human 객체생성
        Human h = new Human();
        h.name = "Steve";
        h.age = 21;
        h.eat();
        h.sleep();

        // 2. Student 객체생성
        Student s = new Student();
        s.name = "Tom";
        s.age = 16;
        s.studentID = 128; // 학생만의 필드
        s.eat();
        s.sleep();
        s.goToSchool(); // Student 만의 메서드

        // 3. Worker 객체생성
        Worker w = new Worker();
        w.name = "Sam";
        w.age = 45;
        w.workerID = 123; // Worker만의 필드
        w.eat();
        w.sleep();
        w.goToWork();  // worker만의 메서드
    }
}
