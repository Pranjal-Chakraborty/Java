import java.util.Scanner;

public class Butterfly {
    
    public static void main(String[] args) {
        
        System.out.println("Enter the height of one half of the butterfly : ");
        Scanner scan =  new Scanner(System.in);
        int height = scan.nextInt();
        scan.close();
        System.out.println("The pattern will be : ");

        // 1st Half
        for(int i = 1; i <= height ; i++){
            // Stars
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            // Spaces
            for(int j= 1; j <= 2 * (height -i); j++){
                System.out.print("  ");
            }
            // Stars
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        // 2nd Half
        for(int i = height; i >= 1 ; i--){
            // Stars
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            // Spaces
            for(int j= 1; j <= 2 * (height -i); j++){
                System.out.print("  ");
            }
            // Stars
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
