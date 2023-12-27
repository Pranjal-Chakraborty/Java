import java.util.Scanner;

public class Largest_of_3_nums {
        public static void main(String[] args) {
        
        System.out.println("Enter three numbers : ");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        scan.close();
        
        if(a >= b && a >= c){
            System.out.println("The largest number is : " + a);
        }
        else if(b >= c){
            System.out.println("The largest number is : " + b);
        }
        else{
            System.out.println("The largest number is : " + c);
        }
    }
}
