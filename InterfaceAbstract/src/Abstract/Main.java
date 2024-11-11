package Abstract;

public class Main {
    public static void main(String[] args) {

        // Calculator
        Addition addition = new Addition();
        addition.displayResult(3,2); //
        Multiply multiply = new Multiply();
        multiply.displayResult(5,6);
        Divide divide = new Divide();
        divide.displayResult(30, 5);
        divide.displayResult(5,10);
        Subtract subtract = new Subtract();
        subtract.displayResult(10,7);

        // Shape
        Circle circle = new Circle(5);
        System.out.println(circle.area());
        Rectangle rectangle = new Rectangle(8,9);
        System.out.println(rectangle.area());
        Square square = new Square(6, 8);
        System.out.println(square.area());

        // Payment
        Payment credit = new CreditCard(20000, "A001","123-456-7890","2030-12-31");
        if (credit.processPayment()){
            // 결제 진행 결과 여부에 따라 영수증 발행
            System.out.println(credit.getReceipt());
        }
        System.out.println();

        Payment mobile = new Mobile(40000, "A002","Kakaopay",true);
        if (mobile.processPayment()) {
            System.out.println(mobile.getReceipt());
        }
        System.out.println();

        Payment cash = new Cash(15000, "A001", 20000);
        if(cash.processPayment()){
            System.out.println(cash.getReceipt());
        }
    }
}
