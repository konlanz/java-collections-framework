package queues;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueDemo {
    public static void showQueue(){
        Queue<Integer> evenNumbers = new ArrayDeque<>();
        //you can use add element to a queue using add
        evenNumbers.add(8);
        evenNumbers.add(6);
        //You can add elements to a queue using offer
        evenNumbers.offer(4);
        evenNumbers.offer(2);

        //to return the elements at the front of a queue we use the peek
        var fistElement = evenNumbers.peek();
        System.out.println(fistElement);

        //you can use the  element() Too// but it throws an exception when queue is empty
        System.out.println(evenNumbers.element());

        //you can use poll to remove item from a queue
        System.out.println(evenNumbers.poll());
        //you can use remove method to remove item from a queue, remove throws an exception when the queue is empty
        System.out.println(evenNumbers.remove());




    }

    public static void main(String[] args) {
        showQueue();
    }
}
