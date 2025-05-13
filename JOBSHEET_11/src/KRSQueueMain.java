import java.util.Scanner;

public class KRSQueueMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        KRSQueue queue = new KRSQueue(10);

        int choice;
        do {
            System.out.println("\n=== KRS Approval System ===");
            System.out.println("1. Enqueue student");
            System.out.println("2. Process 2 students (dequeue)");
            System.out.println("3. View front");
            System.out.println("4. View rear");
            System.out.println("5. Display all");
            System.out.println("6. Clear queue");
            System.out.println("7. Report");
            System.out.println("0. Exit");
            System.out.print("Choose menu: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    if (queue.isFull()) {
                        System.out.println("Queue is full. Cannot add more students.");
                        break;
                    }
                    System.out.print("NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Name: ");
                    String name = sc.nextLine();
                    System.out.print("Study Program: ");
                    String studyProgram = sc.nextLine();
                    System.out.print("Class: ");
                    String className = sc.nextLine();
                    queue.enqueue(new KRS(nim, name, studyProgram, className));
                    break;
                case 2:
                    queue.processApproval();
                    break;
                case 3:
                    queue.peekFront();
                    break;
                case 4:
                    queue.viewRear();
                    break;
                case 5:
                    queue.printAll();
                    break;
                case 6:
                    queue.clear();
                    break;
                case 7:
                    queue.report();
                    break;
                case 0:
                    System.out.println("Exiting. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option!");
            }
        } while (choice != 0);
    }
}