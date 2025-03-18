import java.util.Scanner;

public class MainFactorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a number: ");
        int num = sc.nextInt();

        factorial fk = new factorial();
        System.out.println("The factorial of "+num+" using BF: "+fk.factiorialBF(num));
        System.out.println("The factorial of "+num+" using DC: "+fk.factorialDC(num));
    }
}
