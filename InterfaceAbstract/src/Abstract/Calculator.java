package Abstract;

abstract public class Calculator {
    abstract double calculate(double a, double b);  // calculate는 추상메서드
    void displayResult(double a, double b){  // 추상클래스는 일반메서드도 가질수있다
        System.out.println("Result = "+ calculate(a,b));
    }
}

class Addition extends Calculator{
    @Override
    double calculate(double a, double b) {
        return a+b;
    }
}

class Multiply extends Calculator{
    @Override
    double calculate(double a, double b) {
        return a*b;
    }
}

class Subtract extends Calculator{
    @Override
    double calculate(double a, double b) {
        return a-b;
    }
}

class Divide extends Calculator{
    @Override
    double calculate(double a, double b) {
        return a/b;
    }
}

