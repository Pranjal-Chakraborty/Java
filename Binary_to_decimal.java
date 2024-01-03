import java.util.*;

public class Binary_to_decimal {

    public static void decimal(int num){

        int pow = 0;
        int dec = 0;
        while(num > 0){
            int lastdigit = (num % 10);
            dec = dec + (lastdigit * (int)Math.pow(2 , pow));
            pow ++;
            num /= 10;
        }
        System.out.println("The decimal value of the given number is : " + dec);

    }
    public static void main(String[] args) {

        System.out.println("Enter the binary number : ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();

        decimal(n);
    }
}
