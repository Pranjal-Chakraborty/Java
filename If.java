import java.util.Scanner;

public class If{
    public static void main(String[] args) {
        
        System.out.println("Enter your age : ");
        Scanner scan = new Scanner(System.in);
        int age = scan.nextInt();
        scan.close();
        
        if(age >= 18){
            System.out.println("You are an adult.");
        }
        else{
            System.out.println("You are not an adult.");
        }
    }
}