package Collection;

import java.util.PriorityQueue;
import java.util.Queue;

public class ArrayQueue {
    public static void main(String[] args) {
        PriorityQueue<String>queue=new PriorityQueue<>();
        queue.add("Vivek");
        queue.add("Fenil");
        queue.add("Dhaval");
        queue.add("Ajay");
        queue.add("Pradeep");
        queue.add("Keyure");
        queue.forEach(System.out::println);
        queue.poll();//First element Remove
        System.out.println(queue);//Update Element here
        System.out.println("hrhrih"+queue.peek());
    }
}
