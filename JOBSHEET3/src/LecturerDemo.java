import java.util.Scanner;

public class LecturerDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of lecturers: ");
        int size = sc.nextInt();
        sc.nextLine(); 

        Lecturer10[] lecturerArray = new Lecturer10[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Enter details for Lecturer " + (i + 1) + ":");
            System.out.print("ID: ");
            String id = sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Gender (true for Male, false for Female): ");
            boolean gender = sc.nextBoolean();

            System.out.print("Age: ");
            int age = sc.nextInt();
            sc.nextLine();

            lecturerArray[i] = new Lecturer10(id, name, gender, age);
        }

        System.out.println("\nAll Lecturer Data:");
        LecturerData10.showAllLecturerData(lecturerArray);

        System.out.println("\nCount of Lecturers by Gender:");
        LecturerData10.countLecturerByGender(lecturerArray);

        System.out.println("\nAverage Age by Gender:");
        LecturerData10.averageLecturerAgeByGender(lecturerArray);

        System.out.println("\nOldest Lecturer Info:");
        LecturerData10.showOldestLecturerInfo(lecturerArray);

        System.out.println("\nYoungest Lecturer Info:");
        LecturerData10.showYoungestLecturerInfo(lecturerArray);

        sc.close();
    }
}