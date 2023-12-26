import java.util.*;

public class Binary_operators {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value of a : ");
        int a = scan.nextInt();
        System.out.println("Enter the value of b : ");
        int b = scan.nextInt();
        scan.close();
        System.out.println("Addition of " + a + " and " + b + " is : " + (a + b));
        System.out.println("Subtraction of " + a + " and " + b + " is : " + (a - b));
        System.out.println("Multiplication of " + a + " and " + b + " is : " + (a * b));
        System.out.println("Division of " + a + " and " + b + " is : " + (a / b));
        System.out.println("Modulus of " + a + " and " + b + " is : " + (a % b));
    }
}