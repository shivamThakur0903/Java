package company;
import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter year to check leap year or not : ");
        int year=sc.nextInt();

        boolean isLeap=(year%4==0 || year%100==0) ||(year % 400==0);

        String result=isLeap? "This is Leap year.":"This is not Leap year.";
        System.out.println(result);
    }
}
