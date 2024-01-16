import java.util.*;

public class Array {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of the subjects : ");
        int len = scan.nextInt();

        int marks[] = new int[len];

        System.out.println("Enter the marks of the individual subjects : ");
        for(int i = 0; i < len; i++){
            System.out.println("Enter marks of subject " + (i+1));
            marks[i] = scan.nextInt();
        }

        for(int i = 0; i < len; i++){
            System.out.println("The marks of subject " + (i+1) + " is " + marks[i]);
        }
        scan.close();
    }
}
