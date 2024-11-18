package GenericBound;

class A3{}
class B3 extends A3{}
class C3 extends B3{}
class D3 extends C3{}

class Goods<T>{
    private T t;

    public T getT() {
        return t;
    }
    public void setT(T t) {
        this.t = t;
    }
}
class Test {
    // ? 와일드카드
    void method1 (Goods<A3> g){}
    void method2 (Goods<?> g){}
    void method3 (Goods<? extends B3> g){}
    void method4 (Goods<? super B3> g){}
}

public class GenericBound_3 {
    public static void main(String[] args) {
        Test t = new Test();
        // #1. method1
        t.method1(new Goods<A3>());
        // t.method1(new Goods<B3>()); // 에러 발생 Good(A3)의 데이터타입만 가능!!!
        // t.method1(new Goods<C3>()); // 에러 발생
        // t.method1(new Goods<D3>()); // 에러 발생

        // #2. method2 ?(와일드카드) 사용
        // 와일드카드는 어떤 데이터타입이던 그 자리에 모두 올 수 있으므로
        // 모든 객체타입을 쓸 수 있음
        t.method2(new Goods<A3>());
        t.method2(new Goods<B3>());
        t.method2(new Goods<C3>());
        t.method2(new Goods<D3>());

        // #3. method3 상한제한 - 위에 것을 제한하자
        // extends B3 (B3 포함 B3 이하만)
        // t.method3(new Goods<A3>()); 에러 발생
        t.method3(new Goods<B3>());
        t.method3(new Goods<C3>());
        t.method3(new Goods<D3>());

        // #4. method4 하한제한 - 아래 것을 제한하자
        // super B3 (B3 포함 B3 이상만)
        t.method4(new Goods<A3>());
        t.method4(new Goods<B3>());
        // t.method4(new Goods<C3>()); 에러 발생
        // t.method4(new Goods<D3>()); 에러 발생

    }
}
