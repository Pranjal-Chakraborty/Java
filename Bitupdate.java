import java.util.*;

public class Bitupdate {

    public static int clearbit(int n, int i){
        int bitmask = ~(1 << i);
        return (n & bitmask);
    }
    
    public static int setbit(int n, int i){
        int bitmask = ~(1 << i);
        return (n & bitmask);
    }

    public static int updatebit(int n, int i, int nb){
        
        /*
        Easy way to do this ---->
        if(nb == 0){
            return clearbit(n , i);
        }
        else{
            return setbit(n , i);
        }
        */

        // Standard way of doing this
        n = clearbit(n,i);
        int bitmask = nb << i;
        return (n | bitmask);
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number = scan.nextInt();
        System.out.println("Enter the position of the bit you want to set : ");
        int position = scan.nextInt();
        System.out.println("Enter the bit you want to add : ");
        int newbit = scan.nextInt();
        scan.close();
        System.out.println("Before changes the number is : " + number);
        int result = updatebit(number , position, newbit);
        System.out.println("After changes the number is : " + result);
    }
}
