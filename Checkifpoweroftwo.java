import java.util.Scanner;

public class Checkifpoweroftwo {
    public static boolean checkifpowertwo(int n){
        return ((n&(n-1)) == 0);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = scan.nextInt();
        scan.close();
        boolean result = checkifpowertwo(num);
        if(result == true){
            System.out.println(num + " is a power of 2.");
        }
        else{
            System.out.println(num + " is not a power of 2.");
        }
    }
}
