import java.util.Scanner;

/**
 * 5. WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross salary
 */
public class Programme5_GrossSalary {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Employee ID ");

        int basicsalary = 25000;

        int HRA = basicsalary * 10/100;
        int TA = basicsalary * 8/100;
        int DA = basicsalary*9/100;
        int PF = basicsalary*-20/100;
        int GrossSalary = basicsalary+HRA+TA+DA+PF;

        System.out.println("|----------------------------|");
        System.out.println("|            Salary Slip     |");
        System.out.println("|____________________________|");
        System.out.println("|Employee Id       :   2564  |");
        System.out.println("|Employee Name     :   Jay   |");
        System.out.println("|____________________________|");
        System.out.println("|Basic Salary"  + "         : " + basicsalary + "|");
        System.out.println("|HRA 10% " + " :              " + HRA + "|");
        System.out.println("|TA 8%   " +  "              : " + TA + "|");
        System.out.println("|DA 9%   " +  "              : " + DA + "|");
        System.out.println("|PF 9%   " +  "             : " + PF + "|");
        System.out.println("| __________________________|");
        System.out.println("|Gross Salary " +    ":   "   +  GrossSalary +"|");
        System.out.println("|___________________________|");

    }
}
