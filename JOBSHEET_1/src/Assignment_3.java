import java.util.Scanner;

class Course {
    static String name[] = null;
    static int sks[] = null;
    static int semester[] = null;
    static String days[] = null;
}

public class Assignment_3 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Input how many courses you want to add: ");
        int n = sc.nextInt();

        Course.name = new String[n];
        Course.sks = new int[n];
        Course.semester = new int[n];
        Course.days = new String[n];

        int choice;
        while (true) {
            System.out.println("\n====== Main Menu ======");
            System.out.println("Please select one of the menus below: ");
            System.out.println("1. Add a course");
            System.out.println("2. Display all course");
            System.out.println("3. Display courses based on days");
            System.out.println("4. Display courses based on semester");
            System.out.println("5. Search a course by the name");
            System.out.println("6. Exit the program");
            System.out.print("Please select from the menu: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    addCourse(n);
                    break;
                case 2:
                    displayAllCourse(n);
                    break;
                case 3:
                    displayCourseDay(n);
                    break;
                case 4:
                    displayCourseSem(n);
                    break;
                case 5:
                    searchCourse(n);
                    break;
                case 6:
                    System.out.println("Exiting program....");
                    return;
            }
        }
    }

    public static void addCourse(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("\nInput the course name: ");
            Course.name[i] = sc.nextLine();
            System.out.print("Input the credit hours for the course: ");
            Course.sks[i] = sc.nextInt();
            System.out.print("Input the semester for this course: ");
            Course.semester[i] = sc.nextInt();
            sc.nextLine();
            System.out.print("Input the day this course going to be held: ");
            Course.days[i] = sc.nextLine();
        }
    }

    public static void displayAllCourse(int n) {
        System.out.printf("%n%-20s %-20s %-10s %-10s %n", "Subject", "Credit Hours", "Semester", "Day");
        for (int i = 0; i < n; i++) {
            System.out.printf("%-20s %-20d %-10d %-10s %n", Course.name[i], Course.sks[i], Course.semester[i], Course.days[i]);

        }
    }
    
    public static void displayCourseDay(int n) {
        boolean found = false;

        System.out.print("Input the day you want to search: ");
        String currentDay = sc.nextLine();

        // Print table header once
        System.out.printf("%n%-20s %-20s %-10s %n", "Subject", "Credit Hours", "Semester");

        for (int i = 0; i < n; i++) {
            if (currentDay.equalsIgnoreCase(Course.days[i])) {
                found = true;
                System.out.printf("%-20s %-20d %-10d %n", Course.name[i], Course.sks[i], Course.semester[i]);
            }
        }

        if (!found) {
            System.out.println("The inputted day is not found. Maybe try to input a valid day.");
        }
    }
    
    public static void displayCourseSem(int n) {
        boolean found = false;

        System.out.print("Input the semester you want to search: ");
        int currentSem = sc.nextInt();

        // Print table header once
        System.out.printf("%n%-20s %-20s %-10s %n", "Subject", "Credit Hours", "Day");

        for (int i = 0; i < n; i++) {
            if (currentSem == Course.semester[i]) {
                found = true;
                System.out.printf("%-20s %-20d %-10s %n", Course.name[i], Course.sks[i], Course.days[i]);
            }
        }

        if (!found) {
            System.out.println("The inputted semester is not found. Maybe try to input a valid semester.");
        }
    }

    public static void searchCourse(int n) {
        boolean found = false;

        System.out.print("Input the course name you want to search: ");
        String currentName = sc.nextLine();

        // Print table header once
        System.out.printf("%n%-20s %-20s %-10s %-10s %n", "Subject", "Credit Hours", "Semester", "Day");

        for (int i = 0; i < n; i++) {
            if (currentName.equalsIgnoreCase(Course.name[i])) {
                found = true;
                System.out.printf("%-20s %-20d %-10d %-10s %n", Course.name[i], Course.sks[i], Course.semester[i], Course.days[i]);
            }
        }

        if (!found) {
            System.out.println("The inputted course is not found. Maybe try to input a valid course.");
        }
    }
}