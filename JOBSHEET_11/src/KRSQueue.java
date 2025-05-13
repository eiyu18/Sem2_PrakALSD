public class KRSQueue {
    KRS[] data;
    int front, rear, size, max;
    int approvedCount;

    public KRSQueue(int max) {
        this.max = max;
        data = new KRS[max];
        front = 0;
        rear = -1;
        size = 0;
        approvedCount = 0;
    }

    boolean isEmpty() {
        return size == 0;
    }

    boolean isFull() {
        return size == max;
    }

    void enqueue(KRS krs) {
        if (isFull()) {
            System.out.println("Queue is full!!!");
            return;
        }
        rear = (rear + 1) % max;
        data[rear] = krs;
        size++;
        System.out.printf("%s has joined the KRS approval queue.\n", krs.name);
    }

    void processApproval() {
        if (size < 2) {
            System.out.println("Not enough students to process. Need at least 2.");
            return;
        }
        System.out.println("Processing KRS approval for:");
        for (int i = 0; i < 2; i++) {
            KRS approved = data[front];
            approved.print();
            front = (front + 1) % max;
            size--;
            approvedCount++;
        }
    }

    void peekFront() {
        if (!isEmpty()) {
            System.out.println("First in queue:");
            data[front].print();
        } else {
            System.out.println("Queue is empty!");
        }
    }

    void viewRear() {
        if (!isEmpty()) {
            System.out.println("Last in queue:");
            data[rear].print();
        } else {
            System.out.println("Queue is empty!");
        }
    }

    void printAll() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return;
        }
        System.out.println("All students in queue:");
        int i = front;
        for (int count = 0; count < size; count++) {
            data[i].print();
            i = (i + 1) % max;
        }
        System.out.println("Total in queue: " + size);
    }

    void clear() {
        front = 0;
        rear = -1;
        size = 0;
        System.out.println("Queue cleared!");
    }

    void report() {
        System.out.println("Total students in queue: " + size);
        System.out.println("Total approved: " + approvedCount);
        System.out.println("Remaining capacity: " + (30 - approvedCount));
    }
}