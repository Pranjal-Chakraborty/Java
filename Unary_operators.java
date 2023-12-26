import java.util.*;

public class Unary_operators {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value of a, b and c : ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        scan.close();

        System.out.println("Value of a at step 1 : " + (a++));
        System.out.println("Value of a at step 2 :" + (++a));
        System.out.println("Value of a at step 3 :" + (a--));
        System.out.println("Value of a at step 4 :" + (--a));

        System.out.println("Value of a++ + ++a :" + (a++ + ++a));
        System.out.println("Value of b++ + b++ :" + (b++ + b++));
        System.out.println("Value of c++ + c++ :" + (c++ + c++));
    }
}
