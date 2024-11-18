package GenericClass;

// 제네릭타입이 2개 이상인 경우 ( 갯수 제한이 없음 )

import javax.xml.crypto.dsig.keyinfo.KeyValue;
import java.security.Key;

class KeyValue1 <K,V> {
    private K key; // 값의 의미
    private V value; // 값
    // 주로 2개는 K, V를 사용함
    // Key & Value
    // 객체 생성 시점에 데이터타입을 두개 지정해줘야 함
    // Key와 Value의 관계성을 가져야함


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

        // key만 저장하고 value자리에는 아무값도 저장하고 싶지않을때
        // Void는 빈 자리로 내버려두겠다는 뜻
        KeyValue1<String, Void> kv3 = new KeyValue1<>();  // Void : null이라는 뜻 (비어있다)
        kv3.setKey("key값만 사용");
        String key3 = kv3.getKey();
        System.out.println(key3);
        // setValue
        // kv3.setValue(1); // 에러발생 Void타입 대신 Integer를 입력했기 때문.
        // kv3.setValue("Hello"); // 에러발생 Void타입 대신 String을 입력했기 때문.
        kv3.setValue(null); // 유일하게 Void자리에 입력이 가능한 값 null
        System.out.println(kv3.getValue());
    }
}
