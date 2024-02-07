import java.util.*;

public class iiiD_array {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of boxes : ");
        int m = scan.nextInt();
        System.out.println("Enter the number of the partitions : ");
        int n = scan.nextInt();
        System.out.println("Enter the number of types of balls : ");
        int o = scan.nextInt();

        int balls[][][] = new int[m][n][o];
        
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                for(int k = 0; k < o; k++){
                    System.out.print("Enter box " + (i+1) + " partition " + (j+1) + " type " + (k+1) + " number of balls : ");
                    balls[i][j][k] = scan.nextInt();
                }
            }
        }
        scan.close();

        System.out.println();

        for(int i = 0; i < m; i++){
            for(int j =0; j < n; j++){
                for(int k = 0; k < o; k++){
                    System.out.print(balls[i][j][k] + " ");
                }
            }
            System.out.println();
        }
    }
}
