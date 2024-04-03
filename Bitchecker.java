import java.util.*;

public class Bitchecker {
    public static int getbit(int n, int i){
        int bitmask = 1 << i;
        if((n & bitmask) == 0){
            return 0;
        }
        else{
            return 1;
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number = scan.nextInt();
        System.out.println("Enter the position of the bit you want to check : ");
        int position = scan.nextInt();
        scan.close();
        int result = getbit(number , position);
        System.out.println("The bit at the " + position + " th position of " + number + " is : " + result);
    }
}
