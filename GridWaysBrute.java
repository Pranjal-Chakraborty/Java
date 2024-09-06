import java.util.Scanner;

public class GridWaysBrute {
    
    public static int waysCount(int i, int j, int n, int m){
        //Base Case
        if(i == n-1 && j == m-1){
            return 1;
        }
        else if(i == n || j == m){
            return 0;
        }

        //Recursion
        int ways1 = waysCount(i+1, j, n, m);
        int ways2 = waysCount(i , j+1, n, m);
        return ways1 + ways2;
    }

    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the height of the grid : ");
        int height = scan.nextInt();
        System.out.println("Enter the length of the grid : ");
        int len = scan.nextInt();
        scan.close();
        System.out.println("The total number ways to reach the point (" + (height-1) + ", " + (len-1) + ") from  the point (0, 0) are : " + waysCount(0,0,height,len));
    }
}
