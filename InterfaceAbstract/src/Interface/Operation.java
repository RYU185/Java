package Interface;

// 연산 인터페이스
// 추상클래스 대신 인터페이스 활용
public interface Operation {
    int calculate(int a, int b);

}
class Add implements Operation{
    @Override
    public int calculate(int a, int b) {
        return a+b;
    }
}
//뺄셈
class Subtract implements Operation {
    @Override
    public int calculate(int a, int b) {
        return a-b;
    }
}