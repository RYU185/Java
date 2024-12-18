public class Exception_1 {
    public static void main(String[] args) {
        // try ~ catch ~ finally 문
        try{
            System.out.println(3/0);
        }catch(RuntimeException E){
            // 예외상황에만 실행됨
            // catch() 소괄호 안에 명시된 예외를 알아야만 처리할 수 있음
            // 단, RuntimeException과 같은 부모예외 클래스는 처리가능
            System.out.println("숫자를 0으로 나눌수 없습니다.");
        }finally {
            // 정상, 비정상(예외)의 경우 모두 실행됨
            // 자원의 회수를 위하여 사용함 ( 메모리 할당이 try문안에서 발생했다면 해당 메모리를 삭제하는 것 )
            System.out.println("프로그램 종료");
        }

    }
}
