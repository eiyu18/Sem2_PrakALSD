import java.util.Scanner;

public class LecturerMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LecturerData data = new LecturerData();
        int choice;

        do {
            System.out.println("\n====== Lecturer Menu ======");
            System.out.println("1. Add Data");
            System.out.println("2. Display Data");
            System.out.println("3. Sort Youngest (ASC)");
            System.out.println("4. Sort Oldest (DSC)");
            System.out.println("0. Exit");
            System.out.print("Choose menu: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    sc.nextLine(); 
                    System.out.print("Enter ID: ");
                    String id = sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Gender (M/F): ");
                    char genderChar = sc.next().charAt(0);
                    boolean gender = (genderChar == 'M' || genderChar == 'm');
                    System.out.print("Enter Age: ");
                    int age = sc.nextInt();
                    Lecturer dsn = new Lecturer(id, name, gender, age);
                    data.add(dsn);
                    break;

                case 2:
                    System.out.println("Lecturer Data:");
                    data.print();
                    break;

                case 3:
                    data.sortingASC();
                    break;

                case 4:
                    data.sortingDSC();
                    break;

                case 0:
                    System.out.println("Thank you!");
                    break;

                default:
                    System.out.println("Invalid menu. Try again.");
            }
        } while (choice != 0);

        sc.close();
    }
}