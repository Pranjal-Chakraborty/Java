import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
            
        System.out.println("Enter the first number : ");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        
        System.out.println("Enter the second number : ");
        int b = scan.nextInt();
        scan.close();
        
        int multiply = a * b;
        System.out.println("The multiplication of " + a + " and " + b + " is " + multiply);
    }
}
