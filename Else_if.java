import java.util.Scanner;

public class Else_if {
    public static void main(String[] args) {
        
        System.out.println("Enter your age : ");
        Scanner scan = new Scanner(System.in);
        int age = scan.nextInt();
        scan.close();
        
        if(age >= 18){
            System.out.println("You are an adult.");
        }
        else if(age >= 13 && age <18){
            System.out.println("You are a teenager.");
        }
        else{
            System.out.println("You are a child.");
        }
    }
}
