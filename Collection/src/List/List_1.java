package List;

import java.sql.Array;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

// 배열과 리스트의 비교
public class List_1 {
    public static void main(String[] args) {
        String[] array = new String[]{"A","B","C","D"};
        System.out.println(array.length); // 4
        array[2] = null;  // 2번 index 삭제
        // 배열 속의 데이터를 '요소(Element)'라고 부른다
        // 배열은 요소를 삭제해도 그 메모리 공간은 남아있고 사이즈도 그대로임
        System.out.println(array.length);  // 4
        System.out.println(Arrays.toString(array)); // [A, B, null, D]
        // 배열 중 하나를 null로 놓았을 때,
        // 우리는 null로 비어있는 공간을 채우기 위해 다음 배열에 있는 것을 앞으로 가져오는 추가작업을 해주어야함

        // List
        // List는 인터페이스이므로 객체 생성시 구현클래스가 필요하다
        // 가장 유명한 List의 구현 클래스는 ArrayList
        List<String> aList = new ArrayList<>();
        System.out.println(aList.size()); // 0, (empty 비어있음)
        aList.add("A");
        aList.add("B");
        aList.add("C");
        aList.add("D");
        System.out.println(aList.size()); // 4
        aList.remove("C");
        System.out.println(aList.size()); // 3 (실제 메모리 영역이 삭제됨)
        System.out.println(aList); // [A, B, D]

    }
}
