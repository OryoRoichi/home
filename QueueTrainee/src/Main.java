import exceptions.NoSuchElementException;
import queue.Queue;

public class Main {
    public static void main(String[] args) throws NoSuchElementException {
        Queue queue = new Queue();
        queue.add(0);
        queue.add(1);
        queue.add(2);
        queue.add(3);
        System.out.println(queue.element());
        System.out.println(queue.peek());
        System.out.println((queue.poll()));
        System.out.println((queue.remove()));
        queue.offer(12);
        queue.printQ();
    }
}