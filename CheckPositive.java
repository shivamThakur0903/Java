package company;
import java.util.Scanner;
public class CheckPositive {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter a value to check it is Positive, negative or Zero: ");
        int data=sc.nextInt();

        String result=(data>0)? "Positive": (data ==0)? "Zero" : "Negative";
        //String result=(data>0)? (data < 0)? "Negative":"Positive": (data ==0)? "Zero" : "Negative";
        System.out.println(result);
    }
}
