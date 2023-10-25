import java.util.Scanner;

/**
 * 12. Write a program that tells us input value is number or an alphabet or symbol.
 */
public class Programme12 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char ch;
        System.out.println("Enter a Character : ");
        ch = sc.next().charAt(0);
        System.out.println(ch >= 'a' && ch <= 'z' ? "Small case alphabet"
                : ch >= 'A' && ch <= 'Z' ? "Capital Alphabet"
                : ch >= '0' && ch <= '9' ? "Digit"
                : "Symbol");
    }

}
