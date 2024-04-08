import java.util.*;

public class Fast_exponentiation {
    public static long fastexpo(int n, int p){
        int ans = 1;
        while(n > 0){
            if((n & 1) != 0){
                ans = ans * p;
            }
            p = p * p;
            n = n >> 1;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number = scan.nextInt();
        System.out.println("Enter it's power : ");
        int power = scan.nextInt();
        scan.close();
        long result = fastexpo(number, power);
        System.out.println("The value of " + number + "^" + power + " is : " + result);
    }
}
