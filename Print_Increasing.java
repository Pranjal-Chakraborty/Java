import java.util.Scanner;

public class Print_Increasing {
     
    public static void printNum(int n){
        if(n == 1){
            System.out.print(n + " ");
            return;
        }
        printNum(n-1);
        System.out.print(n + " ");
    }

    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the range : ");
        int limit = scan.nextInt();
        scan.close();
        System.out.println("The numbers from 1 to " + limit + " in increasing order are listed below : ");
        printNum(limit);
    }
}
