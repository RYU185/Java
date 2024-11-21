package List;

// ArrayList사용법 (메서드 사용법)

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class List_3 {
    public static void main(String[] args) {
        List<Integer> aList1 = new ArrayList<>();
        // #1. add (요소 추가 , 맨 뒤에 추가)
        aList1.add(3);
        aList1.add(4);
        aList1.add(5);
        System.out.println(aList1); // [3, 4, 5]

        // #2. add(int index, E element) ( 요소추가, 특정 위치에 추가 )
        aList1.add(1,6);
        System.out.println(aList1); // [3, 6, 4, 5]

        // #3. addAll (또 다른 리스트를 뒤에 추가)
        List<Integer> aList2 = new ArrayList<>();
        aList2.add(1);
        aList2.add(2);
        aList2.addAll(aList1);
        System.out.println(aList2); // [1, 2, 3, 6, 4, 5]

        // #4. addAll (특정위치에 리스트 추가)
        List<Integer> aList3 = new ArrayList<>();
        aList3.add(1);
        aList3.add(2);
        aList3.addAll(1,aList3);
        System.out.println(aList3); // [1, 1, 2, 2]

        // #5. set(수정)
        aList3.set(1,5);
        aList3.set(3,6);
        System.out.println(aList3); // [1, 5, 2, 6]

        // #6. remove(int index) 해당 인덱스의 요소 삭제
        aList3.remove(1); // 1이 아니라 5가 삭제됨
        System.out.println(aList3); // [1, 2, 6]

        // #7. remove(Object o) 해당 요소를 찾아서 삭제
        // 정수의 리스트인 경우에는 정수를 매개변수에 넣으면 인덱스로 인식함!!
        // aList3.remove(1);
        // System.out.println(aList3); [1, 6]
        aList3.remove(Integer.valueOf(1)); // Integer로 타입변환
        System.out.println(aList3); // [2, 6]

        // #8. clear 모두 삭제
        aList3.clear();
        System.out.println(aList3); // []

        // #9. isEmpty 요소가 있는지 없는지 확인할때 사용. 비었다면 true
        System.out.println(aList3.isEmpty()); // true

        // #10. size 리스트의 요소 갯수를 리턴
        System.out.println(aList3.size()); // 0
        aList3.add(1);
        aList3.add(2);
        aList3.add(3);
        System.out.println(aList3);
        System.out.println(aList3.size()); // 3

        // #11. get 리스트의 요소를 읽음
        // System.out.println(aList3[0]); // 오류
        // <주의> 리스트는 배열처럼 인덱스[i]로 읽으면 안됨!
        System.out.println(aList3.get(0)); // 1
        System.out.println(aList3.get(1)); // 2
        System.out.println(aList3.get(2)); // 3

        // 리스트는 반복문은 사용법이 다르다
        for(int i=0; i <aList3.size();i++) {
            System.out.println(aList3.get(i)); // 1 2 3
        }

        // #12. toArray 리스트를 배열로 변환
        Object[] objects = aList3.toArray();
        System.out.println(Arrays.toString(objects));
        // 리스트는 제네릭이므로 모든 클래스가 다 올 수 있음
        // 그러므로 모든 클래스를 대표할수 있는 Object가 온것
        // ??: 다 Integer인거 아는데 Integer로 쓰면 안됨?
        // Integer[] integers = (Integer[]) aList3.toArray();  > 권장X
        // Object의 약한(느슨한) 타입체크로 인해 정상동작을 담보할 수없음
        // 에러를 미연에 방지하는것(컴파일에러)가 효율적인데 런타임에러가 발생할 확률이 높음

        // #13. 그럼 어떻게 타입 변환을 해야 안전한가?
        Integer[] integers = aList3.toArray(new Integer[0]);
        // 새로운 배열을 aList3의 size()와 같은 배열크기로 만들라는 약속 (초기화와 비슷하다)
        System.out.println(Arrays.toString(integers)); // [1,2,3]

        // #14. contains 탐색
        boolean exist = aList3.contains(Integer.valueOf(3));
        if (exist) {
            System.out.println("리스트에서 탐색 성공");
        }else {
            System.out.println("리스트에서 탐색 실패");
        }

        // #15. iterator (탐색자)
        // 컬렉션 요소를 순차적으로 탐색
        Iterator<Integer> iterator1 = aList3.iterator();
        // 탐색자가 다음 요소가 존재한다면 true리턴, 끝에 도달했으면 false리턴
        // 자동으로 탐색자가 끝을 알려주기 때문에 while문에서 안전함
        while(iterator1.hasNext()){
            Integer a = iterator1.next();
            // next(): 현재 탐색자가 위치한 요소를 리턴하고 자동으로 다음으로 넘어감
            // 그래서 while 반복문 내에 iterator의 증가코드가 필요없음 (i++)
            // while의 안정성이 높아짐
            System.out.println(a);
        }
    }
}
