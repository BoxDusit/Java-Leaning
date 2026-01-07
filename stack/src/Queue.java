public class Queue {
    private int maxQueue;
    private Object[] queueArray;
    private int front;
    private int rear;

    public Queue(int s) {
        maxQueue = s;
        queueArray = new Object[maxQueue];
        front = -1;
        rear = -1;
    }

    public void enQueue(Object theData) throws Exception {
        if ((front == 0 && rear == maxQueue - 1) || (front == rear + 1))
            throw new Exception("Queue Overflow");

        if (front == -1) {
            front = 0;
            rear = 0;
        } else if (rear == maxQueue - 1)
            rear = 0;
        else
            rear++;

        queueArray[rear] = theData;
    }


    public void enQueueFront(Object theData) throws Exception {
        if ((front == 0 && rear == maxQueue - 1) || (front == rear + 1))
            throw new Exception("Queue Overflow");

        if (front == -1) {
            front = 0;
            rear = 0;
        } else if (front == 0)
            front = maxQueue - 1;
        else
            front--;

        queueArray[front] = theData;
    }

    public Object deQueue() throws Exception {
        if (front == -1)
            throw new Exception("Queue Underflow");

        Object temp = queueArray[front];
        queueArray[front] = null;

        if (front == rear) {
            front = -1;
            rear = -1;
        } else if (front == maxQueue - 1)
            front = 0;
        else
            front++;

        return temp;
    }

    public void displayQueue() {
        System.out.println("Front = " + front + " , Rear = " + rear);
    }

    public void displayArray() {
        System.out.print("\n");
        for (int i = 0; i < maxQueue; i++) {
            System.out.printf(queueArray[i] + "\n");
        }
        System.out.println();
    }
}
