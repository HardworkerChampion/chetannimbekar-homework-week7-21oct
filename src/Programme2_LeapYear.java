import java.util.Scanner;

/**
 * 2. Write a java program to input any year like (ex.2007)
 * and find out if it is leap year or not?
 */
public class Programme2_LeapYear {
    public static void main(String[] args) {

        int y;
        System.out.println("Enter the Year  : ");
        Scanner scanner = new Scanner(System.in);
        y=scanner.nextInt();

        if(y%100==0 && y%400==0 || y%100!=0 && y%4==0){
            System.out.println("This  is Leap Year");
        }else {
            System.out.println("Its not Leap Year");
        }

    }

}
