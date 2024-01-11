import java.util.*;

public class Hollow_rectangle {
    public static void main(String[] args) {

        System.out.println("Enter the number of rows and columns : ");
        Scanner scan = new Scanner(System.in);
        int rows = scan.nextInt();
        int cols = scan.nextInt();
        scan.close();

        for (int i = 1; i <= rows; i++){
            for(int j = 1; j <= cols; j++){
                if(i == 1 || i == rows || j == 1 || j == cols){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
