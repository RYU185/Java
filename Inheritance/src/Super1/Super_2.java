package Super1;

class AA {
    AA(){
        System.out.println("A생성자");
    }
}
class BB extends AA {
    BB(){
        super();  // AA 생성자를 가리킨다. // 이 코드를 명시적으로 호출하지않아도 컴파일러가 똑같이 호출해줌
        // 부모의 기본생성자는 자동으로 호출되기 때문에 항상 자식 클래스의 영역에는
        // 부모클래스의 영역이 생성됨
        System.out.println("B생성자");
    }
}
class CC {
    // 기본생성자가 없는 상태
    CC(String a){
        System.out.println("C 생성자");
    }
}
class DD extends CC{
    // 이 경우, DD는 반드시 생성자를 선언해줘야 함
    // 밑의 생성자가 아예 없다면 자바가 자식의 기본생성자와 super를 생성
    // super를 따라가서 부모에게 갔지만 정작 필요한 부모의 기본생성자도 없음
    // >> 에러 발생

    DD (){
        // super();  에러발생! 부모에게 기본생성자가 없으므로
        super("문자열");

    }
}


public class Super_2 {
    public static void main(String[] args) {
        BB value1 = new BB();

    }
}
