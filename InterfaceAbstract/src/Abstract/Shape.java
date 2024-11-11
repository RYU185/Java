package Abstract;
// 도형클래스
abstract public class Shape {
    abstract double area(); // 도형의 면적을 구하는 추상메서드
                            // area << 현재는 얘만 반드시 오버라이드 하면 됨
}


class Circle extends Shape{
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI*radius*radius;   // Math는 final 클래스, PI는 static >> Static final
                                        // 추상 클래스의 자식 클래스는 추상 메서드를 오버라이드해야한다는 강제성을 부여
                                        // 단, 자식클래스만의 필드, 메서드 등은 자유롭게 정의할 수 있음!
                                        // 자식 클래스만의 추상 메서드를 정의하는 것도 가능함
    }
}

class Rectangle extends Shape{
    double x; // 가로 길이
    double y; // 세로 길이

    public Rectangle(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    double area() {
        return x * y;
    }
}

class Square extends Rectangle{

    public Square(double x, double y) {
        super(x, y);
    }

}