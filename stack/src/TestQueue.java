public class TestQueue {
    public static void main(String[] args) {
        try {
            Queue q = new Queue(5);

            q.enQueue("A");
            q.enQueue("B");
            q.enQueue("C");
            q.enQueue("D");
            q.displayArray();
            q.displayQueue();

            q.deQueue();
            q.displayArray();
            q.displayQueue();

            q.enQueue("E");
            q.enQueue("FF");
            q.displayArray();
            q.displayQueue();


        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
