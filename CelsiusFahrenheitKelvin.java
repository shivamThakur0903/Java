package company;
import java.util.Scanner;

public class CelsiusFahrenheitKelvin {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.print("Enter value for celsius, fahrenheit and kelvin : ");
        float c= scanner.nextFloat();

        float f= (c*9/5)+32;
        float k= c+273.15f;
        float c1=(f-32)*5/9;
        float c2= k-273.15f;
        System.out.println("Celsius to Fahrenheit :"+ f);
        System.out.println("Celsius to Kelvin :"+k);
        System.out.println("Fahrenheit to Celsius :"+c1);
        System.out.println("Kelvin to Celsius :"+c2);




       /* System.out.println("Here we see Celsius to Fahrenheit and Kelvin.... ");
        System.out.print("Enter a Celsius value : ");
        float c=scanner.nextFloat();
        float f=(c*9/5)+32;
        float k= c+ 273.15f;
        System.out.println("Celsius to Fahrenheit "+ f+ " and Kelvin "+k);


        System.out.println("\nHere we see Fahrenheit to Celsius and Kelvin.... ");
        System.out.print("Enter a Fahrenheit value : ");
        float f1=scanner.nextFloat();
        float c1=(f1-32)*5/9;
        float k1= c1+ 273.15f;
        System.out.println("Fahrenheit to Celsius "+ c1+ " and Kelvin "+k1);

        System.out.println("\nHere we see Kelvin to Celsius and Fahrenheit.... ");
        System.out.print("Enter a Kelvin value : ");
        float k2=scanner.nextFloat();
        float c2=k2-273.15f;
        float f2= (k2- 273.15f)*9/5+32;
        System.out.println("Kelvin to Celsius "+ c2+ " and Fahrenheit "+f2);
        */
    }
}
