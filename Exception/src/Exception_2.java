public class Exception_2 {
    public static void main(String[] args) {
        // 다중 try~catch문
        try {
            System.out.println(3/1);  // 산술예외
            int num = Integer.parseInt("10"); // NumberFormatException
            int[] array = new int[3];
            array[3] = 0; // ArrayIndexOutofBoundsException
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            // 모든 예외에는 디폴트 메세지를 갖고있다
            // e는 메서드의 매개변수처럼 예외 인스턴스 변수이다
            // 내부의 예외상황을 알수 있는 메세지를 갖고 있음
            System.out.println("0으로 나눌수 없음");
        } catch (NumberFormatException e) {
            System.out.println("숫자가 아닙니다");
        }
        // ****중요!
        // RuntimeException이나 Exception같은 부모예외 클래스를 제일 위의 catch문에 선언하면 안됨!

        // 예상 가능한 예외는 catch문을 통해서 예외처리를 해주는 것이 원칙이나,
        // 만약 예상하지 못했던 예외의 가능성이 있다면 제일 아래에 부모 예외 클래스를
        // 추가한다면 모든 예외를 처리해 줄 수 있음
        catch (RuntimeException e) {
            System.out.println("기타 예외 발생...");
        }
    }
}
