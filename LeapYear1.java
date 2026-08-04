package ConditionalFlow;
import java.util.Scanner;

public class LeapYear1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a year to check leap or not : ");
        int year= sc.nextInt();

        if(year% 4==0){
            System.out.println(year+" is a Leap Year.");
        }
        else if(year % 400==0){
            System.out.println(year+" is a Leap Year.");
        }
        else if(year % 4000==0){
            System.out.println(year+" is a Leap Year.");
        }
        else {
            System.out.println(year+" is not a Leap Year.");
        }
    }
}
