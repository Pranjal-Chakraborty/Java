import java.util.Scanner;

public class Decimal_to_binary {

    public static int binary (int n){
        int bin = 0;
        int i = 0;
        while(n > 0){
            int rem = n % 2;
            bin = bin + (rem * (int)Math.pow(10, i));
            i++;
            n = n / 2;
        }
        return bin;
    }
    public static void main(String[] args) {

        System.out.println("Enter the decimal number : ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();

        System.out.println("The binary value of " + n + " is : ");
        int bin_num = binary(n);
        System.out.print(bin_num);
    }
}