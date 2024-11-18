package GenericInheritance;

// 제네릭 클래스의 상속
class Parent<T>{
    T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}
// 제네릭클래스를 상속한 자식클래스도 제네릭클래스임!!!
// 부모의 제네릭타입 변수를 그대로 물려받는다
class Child<T> extends Parent<T>{}
// 만약 자식클래스가 자신만의 제네릭타입 필드를 가진다면??
// 추가로 제네릭 타입을 선언부에 추가해주면 됨
class Child2<T,V> extends Parent<T>{
    V v;
}
class Child3<T,V,K> extends Parent<T>{
    K k;
}

public class Generic_1 {
}
