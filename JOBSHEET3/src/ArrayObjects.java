import java.util.Scanner;

public class ArrayObjects {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rectangles: ");
        int size = sc.nextInt();

        Rectangle10[] rectangleArray = new Rectangle10[size];

        for (int i = 0; i < size; i++) {
            rectangleArray[i] = new Rectangle10();
            System.out.println("Rectangle " + (i + 1));

            System.out.print("Input length: ");
            rectangleArray[i].length = sc.nextInt();

            System.out.print("Input width: ");
            rectangleArray[i].width = sc.nextInt();
        }

        System.out.println("\nDetails of Rectangles:");
        for (int i = 0; i < size; i++) {
            System.out.println("Rectangle " + (i + 1));
            System.out.println("Width: " + rectangleArray[i].width + ", Length: " + rectangleArray[i].length);
        }

        sc.close();
    }
}
