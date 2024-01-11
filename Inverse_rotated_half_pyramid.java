import java.util.Scanner;

public class Inverse_rotated_half_pyramid {
    public static void main(String[] args) {
        
        System.out.println("Enter the height of the pyramid : ");
        Scanner scan =  new Scanner(System.in);
        int height = scan.nextInt();
        scan.close();
        System.out.println("The pyramid will be : ");

        // Outer loop
        for(int i = 1; i <= height ; i++){
            // Spaces
            for(int j = 1; j <= height - i; j++){
                System.out.print("  ");
            }
            // Stars
            for(int j = 1; j <= i; j++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
