import java.util.*;

public class Countsetbits {
    public static int countsetbits(int n){
        int count = 0;
        while(n > 0){
            if((n & 1) != 0){
                count ++;
            }
            n = n >> 1;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = scan.nextInt();
        scan.close();
        int result = countsetbits(num);
        System.out.println("The number of set bits in " + num + " is : " + result);
    }
}
