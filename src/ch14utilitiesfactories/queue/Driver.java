package ch14utilitiesfactories.queue;

public class Driver {

    public static void main(String[] args) {

        QueueManager queueManager = QueueManager.getInstance();
        int num;
        queueManager.enqueue(1);
        queueManager.enqueue(2);
        queueManager.enqueue(3);
        num = queueManager.dequeue();
        System.out.println(num);
    }
}
