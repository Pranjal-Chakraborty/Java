import java.util.Scanner;

public class TilingProblem {
    
    public static int tilingProblem(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        int totalWays = tilingProblem(n-1) + tilingProblem(n-2);
        return totalWays;
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter length width of the floor : ");
        int width = scan.nextInt();
        scan.close();
        System.out.println("The number ways by which tiles having 2 X 1 dimension can be placed to fill the entire floor is : " + tilingProblem(width));
    }
}
