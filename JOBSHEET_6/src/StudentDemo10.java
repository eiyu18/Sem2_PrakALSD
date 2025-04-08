import java.util.Scanner;

public class StudentDemo10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the number of students to input: ");
        int n = sc.nextInt();
        TopStudent10 topStudents = new TopStudent10();

        for (int i = 0; i < n; i++) {
            System.out.println("Input student data " + (i + 1));
            System.out.print("NIM: ");
            String nim = sc.next();
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Class: ");
            String studentClass = sc.next();
            System.out.print("GPA: ");
            double gpa = sc.nextDouble();
            topStudents.add(new Student10(nim, name, studentClass, gpa));
        }

        System.out.println("Original student List:");
        topStudents.print();

        topStudents.bubbleSort();
        System.out.println("Sorted student List (by GPA, descending):");
        topStudents.print();

    }

}
