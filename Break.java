import java.util.Scanner;

public class Break {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        do{
            System.out.println("Enter your number : ");
            int n = scan.nextInt();
            System.out.println("The entered number is : "+ n);
            if (n % 10 == 0){
                break;
            }
        }while(true);
        scan.close();
    }
}
