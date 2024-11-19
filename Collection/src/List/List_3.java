package List;

// ArrayList사용법 (메서드 사용법)

import java.util.ArrayList;
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

        


    }
}
