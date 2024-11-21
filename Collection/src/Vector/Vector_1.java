package Vector;

import java.util.Arrays;
import java.util.List;
import java.util.Vector;

// List인터페이스의 두번째 구현클래스 벡터Vector 사용법
// 멀티스레드 환경에 적합한 동기화기능을 지원한다!
// 멀티스레드를 수행하는데 쓰인다면 Vector를 반드시 사용해야함
public class Vector_1 {
    public static void main(String[] args) {
        List<Integer> vector1= new Vector<>();

        // #1. add
        vector1.add(1);
        vector1.add(2);
        vector1.add(3);
        System.out.println(vector1); // [1, 2, 3]

        // #2. add 중간 삽입
        vector1.add(1,6);
        System.out.println(vector1); // [1, 6, 2, 3]

        // #3. addAll 뒤에 리스트 추가
        List<Integer> vector2 = new Vector<>();
        vector2.add(7);
        vector2.add(8); // [7, 8]
        vector2.addAll(vector1);
        System.out.println(vector2); // [7, 8, 1, 6, 2, 3]

        // #4. addAll 중간에 리스트 삽입
        List<Integer> vector3 = new Vector<>();
        vector3.add(5);
        vector3.add(6);
        vector3.addAll(1,vector3);
        System.out.println(vector3); // [5, 5, 6, 6]

        // #5. set 수정
        vector3.set(1,2);
        vector3.set(3,7);
        System.out.println(vector3); // [5, 2, 6, 7]

        // #6. remove (int index) 인덱스로 삭제
        vector3.remove(1);
        System.out.println(vector3); // [5, 6, 7]

        // #7. remove (Object o) 값으로 삭제
        vector3.remove(Integer.valueOf(7));
        System.out.println(vector3); // [5, 6]

        // #8. clear 전체삭제
        vector3.clear();
        System.out.println(vector3); // []

        // #9. isEmpty
        System.out.println(vector3.isEmpty()); // true

        // #10. size 리스트 내 요소의 갯수
        System.out.println(vector3.size());
        vector3.add(0);
        vector3.add(1);
        vector3.add(2);
        System.out.println(vector3.size());

        // #11. get 읽기
        for (int i=0; i<vector3.size(); i++){
            System.out.println(vector3.get(i));
        }
        // #12. toArray 리스트를 배열로 만듦
        // toArray는 오브젝트의 배열을 리턴하므로 오브젝트의 배열 타입으로 받아야함
        Object[] objects = vector3.toArray();
        System.out.println(Arrays.toString(objects));

        // #13. toArray (Integer의 배열로 받으려면 별도의 명시가 필요함
        Integer[] integer = vector3.toArray(new Integer[0]);
        System.out.println(Arrays.toString(integer));





    }
}
