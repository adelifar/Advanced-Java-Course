import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class TestQueue {
    public static void main(String[] args) {
        Queue<String> queue=new LinkedList<>();
        queue.add("mehdi");
        queue.offer("hosein");
        queue.offer("Ali");
        System.out.println(queue.element());    //if queue is empty throws exception
        System.out.println(queue.peek());   //if queue is empty return null


        while (true){
            if (queue.isEmpty())break;
//            else System.out.println(queue.remove());
            else System.out.println(queue.poll());
        }
        PriorityQueue<Integer> priorityQueue=new PriorityQueue<>();
        priorityQueue.offer(52);
        priorityQueue.offer(12);
        priorityQueue.offer(36);
        while (true){
            if (priorityQueue.isEmpty())break;
            else System.out.println(priorityQueue.poll());
        }
    }
}
