package GenericClass;

// 제네릭타입이 2개 이상인 경우 ( 갯수 제한이 없음 )

import javax.xml.crypto.dsig.keyinfo.KeyValue;

class KeyValue1 <K,V> {
    private K key;
    private V value;
    // 주로 2개는 K, V를 사용함
    // Key & Value
    // 객체 생성 시점에 데이터타입을 두개 지정해줘야 함


    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }
}

public class Generic_5 {
    public static void main(String[] args) {
        // <문자열, 정수>
        KeyValue1<String, Integer> kv1 = new KeyValue1<>();
        // Integer로 사용. int(X)
        // 제네릭타입으로 원시자료형은 사용할 수 없음
        // 원시 자료형은 해당 Wrapping class 사용해야함  ( Integer, Double 등 )
        kv1.setKey("사과");
        kv1.setValue(1010);
        String key1 = kv1.getKey();
        int value1 = kv1.getValue();
        // 위에가 Integer인데 왜 여기는 int? // 자바가 자동으로 형변환을 해줌

        // < 정수, 문자열 >
        KeyValue1<Integer,String> kv2 = new KeyValue1<>();
        kv2.setKey(404); // 웹브라우저 에러코드 404
        kv2.setValue("Not Found Error"); // 에러설명
        int key2 = kv2.getKey();
        String value2 = kv2.getValue();

    }
}
