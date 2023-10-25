/**
 * 3. Write a java program to input student Name, roll No, and three subjects Math, Science
 * and English marks (marks is between 0 to 100 and if it is out of range print error message
 * “Invalid Input, Marks should between 0 to 100”) and find out total, percentage and result.
 * If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80
 * A+, %> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format
 */
public class Programme3_Marksheet {

    public static void main(String[] args) {
        System.out.println( "------------------");
        System.out.println("|   Mark Sheet    | ");
        System.out.println("|_________________|");
        System.out.println("| Name    :    Jay|");
        System.out.println("| Roll No  :    08|");
        System.out.println("|_________________|");
        System.out.println("|Subjects  : Marks| ");
        System.out.println("|_________________|");
        int marks = 98;
        int marks1 = 90;
        int marks2 = 85;
        int marks4 = marks+marks1+marks2;
         double Percertage = 91.0;
        if(marks>=80){
            System.out.println("| Maths   " + " :   "  + marks  + " |");
            System.out.println("| Science " + " :   "  + marks1 + " |");
            System.out.println("| English " + " :   "  + marks2 + " |");
            System.out.println("|_________________|");
            System.out.println("|Total "         +        "    :   "   + marks4 + "|");
            System.out.println("|_________________|");
            System.out.println("|Percentage" + " : "+ Percertage + "|"  );      }


        if(marks>=80){
            System.out.println("|Grade   :     A+|");
            System.out.println("|Result  :   Pass|");
        }else if(marks>=60){
            System.out.println("Grade A");
        }else if (marks>=50){
            System.out.println("Grade B");
        }else if (marks>=35){
            System.out.println("Grade C");
        }else if (marks<50 && marks>=35){
            System.out.println("Pass");

        }else{
            System.out.println("Fail");
        }
        System.out.println("|________________|");


    }
}
