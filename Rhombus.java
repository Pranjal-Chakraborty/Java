import java.util.Scanner;

public class Rhombus {
    public static void main(String[] args) {
        
        System.out.println("Enter the height of the rhombus : ");
        Scanner scan =  new Scanner(System.in);
        int height = scan.nextInt();
        scan.close();
        System.out.println("The pattern will be : ");

        for(int i = 1; i <= height ; i++){
            // Spaces
            for(int j= 1; j <=(height -i); j++){
                System.out.print("  ");
            }
            // Stars
            for(int j = 1; j <= height; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
