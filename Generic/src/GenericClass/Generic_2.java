package GenericClass;

// 모든 클래스의 부모인 Object를 이용하면 문제 해결 가능

class Goods {
    private Object object = new Object();

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }
}

public class Generic_2 {
    public static void main(String[] args) {
        Goods goods1 = new Goods();
        goods1.setObject(new Apple());
        // getObjetct()는 Object를 리턴하므로 Apple로 다운캐스팅 가능
        Apple apple = (Apple) goods1.getObject();

        Goods goods2 =new Goods();
        goods2.setObject(new Pencil());
        Pencil pencil = (Pencil) goods2.getObject();

        Pencil pencil1 = (Pencil)goods1.getObject();  // 런타임 에러 발생

//        Apple이 담겨있는 goods1 객체에서 Pencil을 꺼냈지만
//        컴파일 에러가 발생하지 않는다. 왜?
//        프로그램 실행시에 에러가 발생됨
//        Object는 모든 클래스의 부모클래스로서 모든 타입의 객체 저장이 가능한데
//        자바의 특성상 Object는 약한 타입체크 방식으로만 동작한다
//        그러므로 컴파일 시점에는 타입이 맞는지 여부를 확인할 수 없으며
//        런타임 시 실제 타입 기반으로 확인하게 됨
//        런타임 에러는 개발자들에게 매우 시간낭비 비효율임
//        왜? 컴파일 에러라면 바로 고치면 되니까.
//        run 누르기전의 에러: 컴파일 에러
//        run 누르고나서의 에러: 런타임 에러
//        Object를 사용하는 방법은 하나의 클래스를 사용 가능하게 하고
//        이전의 문제(Generic_1.java)는 해결 가능하지만,
//        타입변환 오류를 즉시 알 수는 없다라는 단점이 있음
//        그래서 Generic을 써야한다


    }
}
