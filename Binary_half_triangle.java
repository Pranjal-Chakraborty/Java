import java.util.Scanner;

public class Binary_half_triangle {
            
    public static void main(String[] args) {
        
        System.out.println("Enter the height of the pyramid : ");
        Scanner scan =  new Scanner(System.in);
        int height = scan.nextInt();
        scan.close();
        System.out.println("The pyramid will be : ");

        for(int i = 1; i <= height ; i++){
            for(int j = 1; j <= i; j++){
                if((i + j) % 2 == 0){
                    System.out.print("1 ");
                }
                else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}
