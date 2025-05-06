import java.util.Scanner;

public class ExcuseLetterDemo {
    public static void main(String[] args) {
        ExcuseLetterStack10 stack = new ExcuseLetterStack10(10);
        Scanner scan = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Submit Excuse Letter");
            System.out.println("2. Process Latest Letter");
            System.out.println("3. View Latest Letter");
            System.out.println("4. Search Letter by Name");
            System.out.println("5. Exit");
            System.out.print("Choose: ");
            choice = scan.nextInt();
            scan.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Student ID: ");
                    String id = scan.nextLine();
                    System.out.print("Name: ");
                    String name = scan.nextLine();
                    System.out.print("Class: ");
                    String className = scan.nextLine();
                    System.out.print("Type (S/I): ");
                    char type = scan.nextLine().charAt(0);
                    System.out.print("Duration (days): ");
                    int duration = scan.nextInt();
                    scan.nextLine();

                    if (type == 'S' || type == 'I') {
                        ExcuseLetter10 letter = new ExcuseLetter10(id, name, className, type, duration);
                        stack.push(letter);
                        System.out.println("Letter submitted!");
                    } else {
                        System.out.println("Invalid type! Use 'S' or 'I'.");
                    }
                    break;

                case 2:
                    ExcuseLetter10 processed = stack.pop();
                    if (processed != null) {
                        System.out.println("\nProcessed Letter:\n" + processed);
                    }
                    break;

                case 3:
                    ExcuseLetter10 latest = stack.peek();
                    if (latest != null) {
                        System.out.println("\nLatest Letter:\n" + latest);
                    }
                    break;

                case 4:
                    System.out.print("Enter student name to search: ");
                    String searchName = scan.nextLine();
                    stack.searchByName(searchName);
                    break;

                case 5:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 5);

        scan.close();
    }
}