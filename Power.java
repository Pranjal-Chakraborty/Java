import java.util.*;

public class Power {
    
    public static int power(int x, int n){
        if(n == 0){
            return 1;
        }
        return x * power(x, n-1);
    }

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = scan.nextInt();
        System.out.println("Enter the power : ");
        int pow = scan.nextInt();
        scan.close();

        System.out.println("The value of " + num + "^" + pow + " is : " + power(num, pow));
    }
}
