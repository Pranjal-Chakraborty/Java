import java.util.Scanner;

public class Ternary_operator {
        public static void main(String[] args) {
        
        System.out.println("Enter a number : ");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        scan.close();
        
        String type = (a % 2 == 0)? "Even" : "Odd" ;
        System.out.println("The number "+ a +" is "+ type +" .");
    }
}