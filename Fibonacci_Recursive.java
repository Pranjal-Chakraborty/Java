import java.util.Scanner;

public class Fibonacci_Recursive {
      
    public static int fibonacci(int n){
        if(n == 0 || n == 1){
            return n;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }

    public static void main(String args[]){
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the range : ");
        int num = scan.nextInt();
        scan.close();
        System.out.println("The fibonacci series of " + num + " numbers is : ");
        for(int i = 0; i < num; i++){
            System.out.print(fibonacci(i)+ " ");
        }
    }
}
