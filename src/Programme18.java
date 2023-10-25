/**
 * Write a Java program to sum values of an array.
 */
public class Programme18 {
    public static void main(String[] args) {

int arraydata[]={12,20,45,65,67,89,87,9,56,78,34};
int sum=0;
for(int k: arraydata){
    sum+=k;
    System.out.println("The total numer of the array element is:   " + sum);
}
    }
}
