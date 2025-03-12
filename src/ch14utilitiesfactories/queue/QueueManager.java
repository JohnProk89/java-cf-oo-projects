package ch14utilitiesfactories.queue;

/**
 * Queue implementation with lazy singleton
 */
public class QueueManager {

    static int[] queue = new int[100];
    static int pivot = -1;

    private QueueManager() {}

    private static QueueManager INSTANCE = null;

    public static QueueManager getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new QueueManager();
        }
        return INSTANCE;
    }

    /**
     * Inserts a number in the back of the queue
     * @param num the number being inserted
     */
    public static void enqueue(int num) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }
        queue[++pivot] = num;
    }

    /**
     * Pops a number from the front of the queue
     * @return the number being popped
     */
    public static int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return 0;
        }
        int valueToReturn = queue[0];
        pivot--;
        shiftQueueLeft();
        return valueToReturn;
    }

    /**
     * Shifts all elements one position to the left.
     * This is necessary after dequeue, to fill the empty space
     */
    private static void shiftQueueLeft() {
        for ( int i = 0; i <= pivot; i++) {
            queue[i] = queue[i + 1];
        }
    }

    private static boolean isEmpty() {
        return pivot == -1;
    }

    private static boolean isFull() {
        return pivot == queue.length - 1;
    }
}
