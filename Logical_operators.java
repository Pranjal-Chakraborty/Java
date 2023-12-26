import java.util.Scanner;

public class Logical_operators {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the values of a and b : ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        scan.close();
        System.out.println("If ("+ a +" > "+ b +") AND ("+ a +" != "+ b +") ? : "+ ((a > b) && (a != b)));
        System.out.println("If ("+ a +" > "+ b +") OR ("+ a +" != "+ b +") ? : "+ ((a > b) || (a != b)));
        System.out.println("If NOT("+ a +" > "+ b +") ? : "+ (!(a > b)));
    }
}
