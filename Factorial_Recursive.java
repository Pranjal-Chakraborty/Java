import java.util.*;

public class Factorial_Recursive {
    
    public static int factorial(int n){
        if(n == 0){
            return 1;
        }
        return n*factorial(n-1);
    }

    public static void main(String args[]){
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = scan.nextInt();
        scan.close();

        int fact = factorial(num);
        System.out.println("The factorial of the given number is : " + fact);
    }
}
