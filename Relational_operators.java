import java.util.*;

public class Relational_operators {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the values of a and b : ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        scan.close();
        System.out.println("If " + a + " = " + b +  " ? : "+ (a == b));
        System.out.println("If " + a + " not equal to " + b +  " ? : "+ (a != b));
        System.out.println("If " + a + " > " + b +  " ? : "+ (a > b));
        System.out.println("If " + a + " < " + b +  " ? : "+ (a < b));
        System.out.println("If " + a + " >= " + b +  " ? : "+ (a >= b));
        System.out.println("If " + a + " <= " + b +  " ? : "+ (a <= b));
    }
}
