import java.util.Scanner;

public class If{
    public static void main(String[] args) {
        
        System.out.println("Enter two numbers : ");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        scan.close();
        
        if(a >= b){
            System.out.println("The largest number is : " + a);
        }
        else{
            System.out.println("The largest number is : " + b);
        }
    }
}