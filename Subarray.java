import java.util.Scanner;

public class Subarray {
    public static void subarrays(int arr[]){
        for(int i = 0; i < arr.length ; i++){
            for(int j = i; j < arr.length ; j++){
                for(int k = i; k < j ; k++){
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
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

        System.out.println("The possible subarrays of the elements in this array will be : ");
        subarrays(array);
    }
}
