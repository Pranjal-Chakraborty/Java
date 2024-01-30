import java.util.Scanner;

public class Pairs_array {

    public static void pairs(int arr[]) {
        for(int i = 0; i < arr.length; i++){
            int curr = arr[i];
            for(int j = i + 1; j < arr.length; j++){
                System.out.print("( " + curr + " , " + arr[j] + " )");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array : ");
        int len = scan.nextInt();

        int array[] = new int[len];

        System.out.println("Enter the elements of the array : ");
        for(int i = 0; i < len; i++){
            array[i] = scan.nextInt();
        }
        scan.close();

        System.out.println("The possible pairs of elements in this array will be : ");
        pairs(array);
    }
}