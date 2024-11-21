package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMap_1 {
    public static void main(String[] args) {
        Map<Integer, String> hMap1 =  new HashMap<Integer, String>();  // 객체가 두개가 필요함

        //#1. put (K key, V value) ( = add )
        hMap1.put(2, "나다라");
        hMap1.put(1, "가나다");
        hMap1.put(3, "다라마");
        hMap1.put(3 ,"ABC");

        // Key 는 중복허용X, values는 중복허용
        // value는 나중에 쓰는 값으로 덮어씀
        System.out.println(hMap1.toString()); //{1=가나다, 2=나다라, 3=다라마}

        //#2. putAll(다른 맵객체)
        Map<Integer, String> hMap2 = new HashMap<Integer, String>();
        hMap2.putAll(hMap1);
        System.out.println(hMap2.toString()); //{1=가나다, 2=나다라, 3=다라마}

        //#3. replace(K key, V value) 업데이트 기능
        // key가 존재하면 업데이트 하고 없으면 아무동작도 하지 않는다.
        hMap2.replace(1, "가가가");
        hMap2.replace(4, "라라라"); //동작안함
        System.out.println(hMap2.toString()); //{1=가가가, 2=나다라, 3=다라마}

        //#4. replace(K key, V oldValue, V newValue)
        // oldValue에만 정확하게 일치하는 경우만 업데이트 수행
        hMap2.replace(1, "가가가", "나나나");
        hMap2.replace(2, "다다다", "라라라"); //동작안함
        System.out.println(hMap2.toString()); //{1=나나나, 2=나다라, 3=다라마}

        //#5. V get(Object key)
        // HashMap은 순서가 없으므로 인덱스를 찾을 수 없음 ()안에있는건 인덱스가 아니다
        // *** <중요> 대신 key를 이용해서 해당 value를 읽는다!
        System.out.println(hMap2.get(1)); //나나나
        System.out.println(hMap2.get(2)); //나다라
        System.out.println(hMap2.get(3)); //다라마

        //#6. containsKey(Object key)
        System.out.println(hMap2.containsKey(1)); //true
        System.out.println(hMap2.containsKey(5)); //false

        //#7. containsValue(Object value)
        System.out.println(hMap2.containsValue("나나나")); //true
        System.out.println(hMap2.containsValue("다다다")); //false

        //#8. Set<K> keySet()
        // Key의 정보만 모아서 Set에 담아 리턴
        // list가 아니고 set으로 변환하는 이유는 중복을 하지 않기 위해서
        Set<Integer> keySet = hMap2.keySet();
        System.out.println(keySet.toString()); //[1, 2, 3]

        // #9. Set<Map.Entry<K,V>> entrySet()
        // Map.Entry는 Map의 이너인터페이스
        // entrySet()는 Key와 value를 쌍으로 묶어서 Set에 담아 리턴
        // 반복문에 주로 사용됨!
        Set<Map.Entry<Integer,String>> entrySet = hMap2.entrySet();
        System.out.println(entrySet.toString()); //[1=나나나, 2=나다라, 3=다라마]

        //#10. size();
        System.out.println(hMap2.size()); //3

        //#11. remove(Object key)
        hMap2.remove(1);
        hMap2.remove(4); //동작안함
        System.out.println(hMap2.toString()); //{2=나다라, 3=다라마}

        //#12. remove(Object key, Object value)
        hMap2.remove(2, "나다라");
        hMap2.remove(3, "다다다"); //동작안함
        System.out.println(hMap2.toString()); //{3=다라마}

        //#13. clear()
        hMap2.clear();
        System.out.println(hMap2.toString()); //{}
    }
}