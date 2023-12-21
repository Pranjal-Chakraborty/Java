import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        System.out.println("Enter your name : ");
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        System.out.println("Your name is " + name);
    }
}
