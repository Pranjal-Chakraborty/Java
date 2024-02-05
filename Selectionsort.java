import java.util.Scanner;

public class Selectionsort {
    public static void selectionsort(int arr[]){
        for(int i =0; i < arr.length-1; i++){
            int minpos = i;
            for(int j = i+1; j < arr.length; j++){
                if(arr[minpos] > arr[j]){
                    minpos = j;
                }
            }
            int temp = arr[minpos];
            arr[minpos] = arr[i];
            arr[i] = temp;
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
        selectionsort(array);
    }
}
