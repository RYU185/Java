package Set;

import com.sun.jdi.request.StepRequest;

import java.sql.SQLOutput;
import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSet_1 {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        // Treeset에 정수데이터를 자동으로 추가
        for(int i=50;i>0;i-=2){
            treeSet.add(i);
        }
        System.out.println(treeSet); // [2,4,6,8,10,...46, 48, 50]
        // 50, 48, 46... 순서대로 입력했지만 자동으로 정렬되어 출력됨

        // #1. first
        System.out.println(treeSet.first());
        // #2. last
        System.out.println(treeSet.last());
        // #3. lower // 매개변수보다 작은데이터 읽기
        System.out.println(treeSet.lower(26));
        // #4. higher // 매개변수보다 큰데이터 읽기
        System.out.println(treeSet.higher(26));
        // #5. floor // 본인포함 매개변수보다 작거나 같은(<=) 데이터 읽기
        System.out.println(treeSet.floor(25));
        System.out.println(treeSet.floor(26));
        // #6. ceiling // 본인포함 매개변수도다 크거나 긑은 데이터 읽기
        System.out.println(treeSet.ceiling(25));
        System.out.println(treeSet.ceiling(26));
        System.out.println();


        // 꺼내기 : 데이터를 읽으면서 지우다
        // #7. pollFirst 첫번째 데이터를 꺼냄
        int size = treeSet.size();
        System.out.println(size); // 25
        for (int i =0; i<size; i++){
            // 25회 treeSet에서 데이터를 꺼냄
            System.out.println(treeSet.pollFirst()); // 2, 4, 6, 8, 10, 12...
        }
        System.out.println(treeSet.size()); // 0

        // #8. pollLast 마지막 데이터를 꺼냄
        for (int i=50; i>0; i-=2){
            treeSet.add(i);
        }
        size = treeSet.size();
        for(int i=0; i<size; i++){
            System.out.println(treeSet.pollLast()); // 50, 48, 46, 44, 42....
        }
        System.out.println(treeSet.size()); // 0

        for (int i=50; i>0; i-=2){
            treeSet.add(i);
        }
        // Set으로부터 특정조건의 Set을 얻는 메서드
        // #9. headSet 특정조건을 기준으로 앞부분 Set을 읽음
        SortedSet<Integer> sSet = treeSet.headSet(20); // 20 포함X
        System.out.println(sSet); // [2, 4, 6, 8, 10, 12, 14, 16, 18]
        // NavigableSet으로 타입변환을 하면 조건의 포함여부를 선택할수 있다!
        // true는 포함O, false는 포함X
        NavigableSet<Integer> nSet = treeSet.headSet(20,true);
        System.out.println(nSet); // [2, 4, 6, 8, 10, 12, 14, 16, 18, 20]

        // #10. tailSet 특정조건을 기준으로 뒷부분 Set을 읽음
        sSet = treeSet.tailSet(20); // tailSet은 포함O
        System.out.println(sSet); // [20, 22, 24, 26, 28, 30, 32, 34, 36, 38, 40, 42, 44, 46, 48, 50]
        nSet = treeSet.tailSet(20,false);
        // false이기 때문에 조건을 포함하지않음!
        System.out.println(nSet); // [22, 24, 26, 28, 30, 32, 34, 36, 38, 40, 42, 44, 46, 48, 50]

    }
}
