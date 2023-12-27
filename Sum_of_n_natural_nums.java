import java.util.Scanner;

public class Sum_of_n_natural_nums { 
    public static void main(String[] args) {
        System.out.println("Enter the limit : ");
        Scanner scan = new Scanner(System.in);
        long n = scan.nextLong();
        scan.close();
        int counter = 1;
        int sum = 0;
        System.out.println("The sum of first "+ n +" natural numbers is : ");
        while(counter<=n){
            sum += counter;
            counter++;
        }
        System.out.println(sum);
    }
}
