import java.util.*;

public class Bitsetter {
    public static int setbit(int n, int i){
        int bitmask = 1 << i;
        System.out.println("Before changes the number is : " + n);
        return (n | bitmask);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number = scan.nextInt();
        System.out.println("Enter the position of the bit you want to set : ");
        int position = scan.nextInt();
        scan.close();
        int result = setbit(number , position);
        System.out.println("After changes the number is : " + result);
    }
}
