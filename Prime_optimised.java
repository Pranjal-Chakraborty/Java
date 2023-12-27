import java.util.*;

public class Prime_optimised {
        public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = scan.nextInt();
        scan.close();

        boolean isPrime = true;
        for(int i = 2; i<= Math.sqrt(num); i++){
            if(num % i == 0){
                isPrime = false;
            }
        }

        if(isPrime == true){
            System.out.println("The number "+ num +" is prime.");
        }
        else{
            System.out.println("The number "+ num +" is not prime.");
        }
    }
}