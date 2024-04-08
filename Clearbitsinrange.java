import java.util.*;

public class Clearbitsinrange {
    public static int clearbitsinrange(int n, int i, int j){
        int a = ((~0)<<(j+1));
        int b = ((1<<i) - 1);
        int bitmask = (a | b);
        System.out.println("Before changes the number is : " + n);
        return (n & bitmask);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number = scan.nextInt();
        System.out.println("Enter the range of bits you want to clear : ");
        int start = scan.nextInt();
        int end = scan.nextInt();
        scan.close();
        int result = clearbitsinrange(number , start, end);
        System.out.println("After changes the number is : " + result);
    }
}
