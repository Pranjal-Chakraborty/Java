import java.util.Scanner;

public class Reverse_num_without_array {
    public static void main(String[] args) {
        
        System.out.println("Enter the number : ");
        Scanner scan = new Scanner(System.in);
        long num = scan.nextLong();
        scan.close();

        System.out.println("The reverse of the given number is : ");
        while(num > 0){
            long lastdigit = num % 10;
            System.out.print(lastdigit);
            num /= 10;
        }
    }    
}
