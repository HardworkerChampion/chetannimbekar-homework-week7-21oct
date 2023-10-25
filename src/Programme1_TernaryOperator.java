import java.util.Scanner;

/**
 * 1. Write a java program that tells us that Input number is odd or even?
 * HINT: use ternary operator (? :)
 */
// This is Class
public class Programme1_TernaryOperator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println(" Pls Enter the Number Pls ");
        int num = scanner.nextInt();
        String result = (num % 2 == 0) ? "Even" : "Odd";
        System.out.println("This Number is : " + result);
        scanner.close();
    }
}
