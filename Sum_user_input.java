import java.util.Scanner;

public class Sum_user_input {
    public static void main(String[] args) {
        
        System.out.println("Enter the first number : ");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        
        System.out.println("Enter the second number : ");
        int b = scan.nextInt();
        scan.close();
        
        int sum = a + b;
        System.out.println("The sum of " + a + " and " + b + " is " + sum);
    }
}
