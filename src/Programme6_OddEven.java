import java.util.Scanner;

/**
 * 6. Write a java program to input any number and find out if it’s odd or even
 */

public class Programme6_OddEven {
    public static void main(String[] args) {

        int n;
        System.out.println("Enter any Number you would Like : ");
        Scanner r = new Scanner(System.in);
        n=r.nextInt();
        if(n%2==0){
            System.out.println("This is Even Number");
        }else {
            System.out.println("This is Odd Number ");
        }
    }
}
