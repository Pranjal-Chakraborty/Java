import java.util.*;

public class Bitwise_evenodd{
    public static void checkoddoreven(int n){
        int bitmask = 1;
        if((n & bitmask) == 0){
            System.out.println(n + " is an even number.");
        }
        else{
            System.out.println(n + " is an odd number.");
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number = scan.nextInt();
        scan.close();
        checkoddoreven(number);
    }
}