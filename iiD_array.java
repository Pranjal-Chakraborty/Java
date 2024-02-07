import java.util.*;

public class iiD_array {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of students : ");
        int m = scan.nextInt();
        System.out.println("Enter the number of the subjects : ");
        int n = scan.nextInt();

        int marks[][] = new int[m][n];
        for(int i = 0; i < m; i++){
            for(int j =0; j < n; j++){
                System.out.print("Enter Student " + (i+1) + " subject " + (j+1) + " marks : ");
                marks[i][j] = scan.nextInt();
            }
        }
        scan.close();

        System.out.println();

        for(int i = 0; i < m; i++){
            for(int j =0; j < n; j++){
                System.out.print(marks[i][j] + " ");
            }
            System.out.println();
        }
    }
}