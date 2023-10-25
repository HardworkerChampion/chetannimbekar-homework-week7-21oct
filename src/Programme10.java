import java.util.Scanner;

/**
 * 10. Write a java program to input any two number and ask user to enter their symbol (+, -, /, *) find addition, Subtraction, multiplication and division
 * according to their symbol (using if else
 */

public class Programme10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number  :  ");
        int number = sc.nextInt();
        switch(number){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                 System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Week Contains 1 to 7 days");
        }

    }
}

