import java.util.Scanner;

public class Floyd_triangle {
        
    public static void main(String[] args) {
        
        System.out.println("Enter the height of the pyramid : ");
        Scanner scan =  new Scanner(System.in);
        int height = scan.nextInt();
        scan.close();
        System.out.println("The pyramid will be : ");

        int counter = 1;
        for(int i = 1; i <= height ; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }
    }
}
