import java.util.Scanner;

public class PrintSum_Recursion {
        
    public static int sum(int n){
        if(n == 1){
            return 1;
        }
        return n + sum(n-1);
    }

    public static void main(String args[]){
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the range : ");
        int num = scan.nextInt();
        scan.close();

        int ans = sum(num);
        System.out.println("The sum of " + num + " natural numbers is : " + ans);
    }
}
