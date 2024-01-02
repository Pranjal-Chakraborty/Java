//This code shows hoe we can implement call by reference method in java.

import java.util.Scanner;

public class Call_by_reference {

    public static int sq( int n) {
        
        n *= n;
        return n;
    }
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = scan.nextInt();
        scan.close();

        int square = sq(num);
        System.out.println("The square of the given number is : " + square);
    }   
}
