package company;

public class SwapNumber {
    public static void main(String[] args) {
        int a = 100;
        int b = 200;

        /*a= a+b;
        b=a-b;
        a=b+b;
        System.out.println("Swapping of 2 value.");
        System.out.println(a);
        System.out.println(b);

         */
        a = a ^ b;  //a=100^200=30
        b = a ^ b;  //b=(100^200) ^200= 100 ^ 0= 100
        a = a ^ b;  //a=(100 ^ 200) ^100= 0 ^ 200= 200    }
        System.out.println(a);
        System.out.println(b);
    }
}
