import java.util.Scanner;

public class Print_num_till_n {
    public static void main(String[] args) {
        System.out.println("Enter the limit : ");
        Scanner scan = new Scanner(System.in);
        long n = scan.nextLong();
        scan.close();
        int counter = 1;
        System.out.println("The numbers form 1 to "+ n +" is :");
        while(counter<=n){
            System.out.println(counter);
            counter++;
        }
    }
}