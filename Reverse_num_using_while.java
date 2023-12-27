import java.util.Scanner;

public class Reverse_num_using_while {
    public static void main(String[] args) {
        
        System.out.println("Enter the number : ");
        Scanner scan = new Scanner(System.in);
        long num = scan.nextLong();
        scan.close();

        long rev = 0;
        System.out.println("The reverse of the given number is : ");
        while(num > 0){
            long lastdigit = num % 10;
            rev = (rev * 10) + lastdigit;
            num /= 10;
        }
        System.out.println(rev);
    } 
}
