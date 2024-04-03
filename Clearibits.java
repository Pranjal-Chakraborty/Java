import java.util.*;

public class Clearibits {
    public static int clearibits(int n, int i){
        int bitmask = (~0) << i;
        System.out.println("Before changes the number is : " + n);
        return (n & bitmask);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number = scan.nextInt();
        System.out.println("Enter the number of bits you want to clear : ");
        int position = scan.nextInt();
        scan.close();
        int result = clearibits(number , position);
        System.out.println("After changes the number is : " + result);
    }
}
