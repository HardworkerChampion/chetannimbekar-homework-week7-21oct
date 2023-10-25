/**
 * 16. Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or “ZERO”
 */

public class Programme16 {

    public static void main(String[] args) {
        int num = 12;
        if (num > 0) {
            System.out.println("Positive");
        } else {
            if (num < 0) {
                System.out.println("Negative");
            } else {
                System.out.println("Zero");
            }
        }
    }
}
