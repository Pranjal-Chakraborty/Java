import java.util.Scanner;

public class Bionomial_coeff {
        public static int factorial(int n){
        
        int f = 1;
        for(int i = 1; i <= n; i++){
            f *= i;
        }
        return f;
    }
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the values of n and r : ");
        int n = scan.nextInt();
        int r = scan.nextInt();
        scan.close();

        int n_fact = factorial(n);
        int r_fact = factorial(r);
        int n_min_r_fact = factorial(n-r);
        int bio_co = (n_fact)/(r_fact * n_min_r_fact);

        System.out.println("The value of " + n + "c" + r + " is : " + bio_co);
    }
}
