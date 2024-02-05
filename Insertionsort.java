import java.util.Scanner;

public class Insertionsort {
    public static void insertionsort(int arr[]){
        for(int i =1; i < arr.length; i++){
            int curr = arr[i];
            int prev = i-1;
            while(prev >= 0 && arr[prev] > curr){
                arr[prev + 1] = arr[prev];
                prev--;
            }
            arr[prev+1] = curr;
        }
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
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

        System.out.println("Before sorting the array elements are : ");
        for(int i = 0; i < len; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("After swapping the array elemets are : ");
        insertionsort(array);
    }
}
