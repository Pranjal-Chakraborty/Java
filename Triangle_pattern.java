import java.util.Scanner;

public class Triangle_pattern {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of rows : ");
        int n = scan.nextInt();
        scan.close();
        System.out.println("The pattern is : ");
        
        for(int row = 1; row <= n; row++){
            for(int col = 1; col <= row; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
