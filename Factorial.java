import java.util.Scanner;

public class Factorial {

    public static int factorial(int n){
        
        int f = 1;
        for(int i = 1; i <= n; i++){
            f *= i;
        }
        return f;
    }
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = scan.nextInt();
        scan.close();

        int fact = factorial(num);
        System.out.println("The factorial of the given number is : " + fact);
    }
}
