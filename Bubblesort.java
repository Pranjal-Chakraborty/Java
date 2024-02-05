import java.util.Scanner;

public class Bubblesort {
    public static void bubblesort(int arr[]){
        boolean swap;
        for(int i = 0; i < arr.length-1; i++){
            swap = false;
            for(int j = 0; j < arr.length-1-i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap = true;
                }
            }
            if(!swap){
                break;
            }
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
        bubblesort(array);
    }
}
