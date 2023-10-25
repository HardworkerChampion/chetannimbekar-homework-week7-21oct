import java.util.Scanner;

public class Programme19 {

    public static void main(String[] args) {
        int a[]=new int[5];int sum=0;double avg;
        Scanner r=new Scanner(System.in);
        System.out.println("Enter array Elements  :   ");
        for(int i=0;i<5;i++){
            a[i]=r.nextInt();
        }
        System.out.println("Array Elements ");
    for(int i=0;i<5;i++){
        System.out.println(a[i]+"");
    }
    for(int i=0;i<5;i++){
        sum=a[i]+sum;
    }
    avg=sum/5.0;
        System.out.println("\n Addition " + sum+"\n Average" + avg);
    }
}
