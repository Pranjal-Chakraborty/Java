import java.util.*;

public class Primes_in_range {

    public static boolean isPrime(int n){
        if(n == 2){
            return true;
        }
        for(int i = 2; i <= Math.sqrt(n) ; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void PrimeInRange(int n){
        for(int i = 2; i <= n; i++){
            if(isPrime(i)){
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        
        Scanner scan =  new Scanner(System.in);
        System.out.println("Enter the range : ");
        int range = scan.nextInt();
        scan.close();

        System.out.println("The prime numbers form 2 to " + range + " are : ");
        PrimeInRange(range);
    }
}
