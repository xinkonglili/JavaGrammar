
import java.util.LinkedList;
import java.util.Queue;
/*Queue:是接口，找实现类，去new实现类，附属给这个接口上
*   - LinkedList:双链表
*   - PriorityQueue<>：优先队列
*
*
* */
public class QueueTest  {
    public static void main(String[] args) {
        LinkedList<Object> queue = new LinkedList<>();
        queue.add(7);
        queue.add(9);
        queue.add(3);
        System.out.println(queue);//[7, 9, 3]

        queue.addFirst(8);
        System.out.println(queue);//[8, 7, 9, 3]

        queue.addLast(8);
        System.out.println(queue);//[8, 7, 9, 3, 8]

        LinkedList que = (LinkedList) queue.clone();
        que.add(5);
        System.out.println(que);//[8, 7, 9, 3, 8, 5]






    }
}
