import java.util.Scanner;

public class Assignment_operators {
    public static void main(String[] args) {
        System.out.println("Enter two numbers a and b : ");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        scan.close();
        System.out.println("The value of "+ a +" += 10 is : "+ (a += 10));
        System.out.println("The value of "+ a +" -= 5 is : "+ (a -= 5));
        System.out.println("The value of "+ b +" *= 2 is : "+ (b *= 2));
        System.out.println("The value of "+ b +" /= 2 is : "+ (b /= 2));
    }
}
