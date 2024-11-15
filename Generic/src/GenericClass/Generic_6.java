package GenericClass;
// 제네릭 타입이 3개인 경우 예제
// 너무 많아질 경우에는 가독성을 생각하자
class Triple<A,B,C>{
    private A first;
    private B second;
    private C third;

    public Triple(A first, B second, C third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public A getFirst() {
        return first;
    }

    public B getSecond() {
        return second;
    }

    public C getThird() {
        return third;
    }
}

public class Generic_6 {
    public static void main(String[] args) {
        Triple<String, Integer, Double> triple =
                new Triple<>("Apple",3,13.35);
        String fruit = triple.getFirst();
        Integer count = triple.getSecond();
        Double weight = triple.getThird();
        // 컴파일시점에 이미 데이터타입이 결정되어있다 ( 자동완성으로 getFirst, getSecond, getThird를 완성시켜주는 이유)
        System.out.println(fruit+" "+ count+ " "+ weight);
    }
}
