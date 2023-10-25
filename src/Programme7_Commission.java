import java.util.Scanner;

/**
 * 7. Write a java program input sales id, seller's name, sales amount, and salary basic and then
 * fined this sales
 * Commission Sales amount >= 50,000 35% Sales amount >= 30,000 20% >= 20,000 10% >= 10,000
 * 5% < 10,000 2%
 */
public class Programme7_Commission {
    public static void main(String[] args) {
        double sales = 0.0, comm = 0.0;
        Scanner ss = new Scanner(System.in);
        System.out.println("Enter the sales ID");
        ss.nextDouble();
        System.out.println("Enter the name");
        ss.next();
        System.out.println("Enter sales Amount ");
        sales = ss.nextDouble();
        System.out.println("Enter the Basic Salary");
        int Salary = ss.nextInt();
        ss.close();

        if (sales > 0 && sales >= 50000) {
            comm = (sales * 35) / 100;
        } else if (sales > 0 && sales >= 30000) {
            comm = (sales * 20) / 100;
        } else if (sales > 0 && sales >= 20000) {
            comm = (sales * 10) / 100;
        } else if (sales > 0 && sales >= 10000) {
            comm = (sales * 5) / 100;
        } else if (sales > 0 && sales < 10000) {
            comm = (sales * 2) / 100;
        }
        System.out.println("Sales " + sales);
        System.out.println("Commission is  " + comm);

    }
}
