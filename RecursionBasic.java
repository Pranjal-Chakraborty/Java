import java.util.*;

public class RecursionBasic{
    
    public static void printNum(int n){
        if(n == 1){
            System.out.print(n);
            return;
        }
        System.out.print(n + " ");
        printNum(n-1);
    }

    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the range : ");
        int limit = scan.nextInt();
        scan.close();
        System.out.println("The numbers from " + limit + " to 1 in decreasing order are listed below : ");
        printNum(limit);
    }
}