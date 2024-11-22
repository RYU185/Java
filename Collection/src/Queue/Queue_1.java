package Queue;

// 큐 (Queue) Interface (인터페이스) - 구현체 필요
// 선입선출 FIFO ( = First In First Out )
// 주로 키보드 입력 등의 이벤트Event 처리에 사용됨
// 먼저 들어온 객체정보를 먼저 사용함
// 구현체로는 LinkedList 또는 PriorityQueue(내부적으로 우선순위가 높은 프로세스를 앞으로)를 많이 사용
// LinkedList의 노드 연결방식이 큐의 특징인 짧은 시간 내에 일어나는 잦은 삽입과 삭제의 처리에 적합하기 때문
// LinkedList가 List의 구현체임과 동시에 Queue의 구현체이기도 함
// 안전장치가 있고 없는 메서드가 존재함

import java.sql.SQLOutput;
import java.util.LinkedList;
import java.util.Queue;

public class Queue_1 {
    public static void main(String[] args) {
        // 예외처리가 없는 메서드 ( 안전장치가 없으므로 조심해서 사용 )
        Queue<Integer> q1 = new LinkedList<>();
        // #1. add 추가 (Queue의 사이즈가 꽉 차서 더이상 추가할 수 없으면 에러발생)
        q1.add(3);
        q1.add(4);
        q1.add(5);

        // #2. element 읽기 (삭제X)
        System.out.println(q1.element()); // 3
        // #3.  remove 삭제 (꺼내면서 삭제)
        // 선입선출
        System.out.println(q1.remove()); // 3
        System.out.println(q1.remove()); // 4
        System.out.println(q1.remove()); // 5
        // System.out.println(q1.remove()); // 오류발생 -> Queue가 비었음 + 안전장치없음

        // 예외처리 있는 메서드 (안전장치있음)
        Queue<Integer> q2 = new LinkedList<>();
        // #4. offer 추가 (큐의 크기가 다 차도 에러가 발생하지 않는 대신 추가하지 않음)
        q2.offer(3);
        q2.offer(4);
        q2.offer(5);
        // #5. peek 읽기
        System.out.println(q2.peek()); // 3
        // #6. poll 꺼내면서 지우기
        System.out.println(q2.poll()); // 3
        System.out.println(q2.poll()); // 4
        System.out.println(q2.poll()); // 5
        System.out.println(q2.poll()); // null > 오류 발생안함
        // 결론 : offer peek poll 써라

     }
}
