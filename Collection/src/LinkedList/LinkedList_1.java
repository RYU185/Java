package LinkedList;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

// List인터페이스의 두번째 구현클래스 Vector 사용법

public class LinkedList_1 {
    public static void main(String[] args) {
        List<Integer> linkedList = new LinkedList<>();

        // #1. add 뒤에 추가
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);
        System.out.println(linkedList); // [3,4,5]
        // #2. add 중간 삽입
        linkedList.add(1,6);
        System.out.println(linkedList); // [3,6,4,5]
        // #3. addAll 뒤에 리스트 추가
        List<Integer> linkedList2 = new Vector<>();
        linkedList2.add(1);
        linkedList2.add(2); // [1,2]
        linkedList2.addAll(linkedList);
        System.out.println(linkedList2); // [1,2,3,6,4,5]
        // #4. addAll 중간에 리스트 삽입
        List<Integer> linkedList3 = new Vector<>();
        linkedList3.add(1);
        linkedList3.add(2); // [1,2]
        linkedList3.addAll(1, linkedList3);
        System.out.println(linkedList3); // [1,1,2,2]
        // #5. set 수정
        linkedList3.set(1,5);
        linkedList3.set(3,6);
        System.out.println(linkedList3); // [1,5,2,6]
        // #6. remove(int index) 인덱스로 삭제
        linkedList3.remove(1);
        System.out.println(linkedList3); // [1,2,6]
        // #7. remove(Object o) 값으로 삭제
        linkedList3.remove(Integer.valueOf(2));
        System.out.println(linkedList3); // [1,6]
        // #8. clear 전체삭제
        linkedList3.clear();
        System.out.println(linkedList3); // []
        // #9. isEmpty 리스트가 비었는지 확인 (참 또는 거짓 리턴)
        System.out.println(linkedList3.isEmpty()); // true
        // #10. size 리스트내 요소의 갯수
        System.out.println(linkedList3.size()); // 0
        linkedList3.add(1);
        linkedList3.add(2);
        linkedList3.add(3);
        System.out.println(linkedList3.size()); // 3
        // #11. get 읽기
        for (int i=0; i<linkedList3.size(); i++) {
            System.out.println(linkedList3.get(i));
        }
        // #12. toArray 리스트를 배열로 타입변환
        // toArray는 오브젝트의 배열을 리턴하므로 오브젝트의 배열 타입으로 받아야함
        Object[] objects = linkedList3.toArray();
        System.out.println(Arrays.toString(objects)); // [1,2,3]
        // #13. toArray (Integer의 배열로 받으려면 별도의 명시를 해줘야함)
        Integer[] integers = linkedList3.toArray(new Integer[0]);
        System.out.println(Arrays.toString(integers)); // [1,2,3]
    }
}