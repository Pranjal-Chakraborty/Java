import java.util.Scanner;

public class Odd_even {
    public static void main(String[] args) {
        
        System.out.println("Enter a number : ");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        scan.close();
        
        if(a % 2 == 0){
            System.out.println("The number " + a + " is even.");
        }
        else{
            System.out.println("The number " + a + " is odd.");
        }
    }
}
