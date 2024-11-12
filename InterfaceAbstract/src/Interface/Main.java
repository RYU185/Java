package Interface;

public class Main {
    public static void main(String[] args) {
        Operation o1 = new Add();
        Operation o2 = new Subtract();
        System.out.println(o1.calculate(5,1));
        System.out.println(o2.calculate(6,2));

    }
}
