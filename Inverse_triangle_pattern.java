import java.util.Scanner;

public class Inverse_triangle_pattern {
        public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of rows : ");
        int n = scan.nextInt();
        scan.close();
        System.out.println("The pattern is : ");
        
        for(int row = 1; row <= n; row++){
            for(int col = 1; col <= (n - row + 1); col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
