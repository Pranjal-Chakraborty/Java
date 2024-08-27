import java.util.Scanner;

public class QuickSort {
    
    public static void printArr(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void quickSort(int arr[], int si, int ei){
        if(si >= ei){
            return;
        }
        int pivIdx = partition(arr, si, ei);
        quickSort(arr, si, pivIdx - 1);
        quickSort(arr, pivIdx + 1, ei);
    }

    public static int partition(int arr[], int si, int ei){
        int pivot = arr[ei];
        int i = si-1;
        for(int j = si; j < ei; j++){
            if(arr[j] <= pivot){
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array : ");
        int len = scan.nextInt();

        int array[] = new int[len];

        System.out.println("Enter the elements of the array : ");
        for(int i = 0; i < len; i++){
            array[i] = scan.nextInt();
        }
        scan.close();
        
        System.out.println("The entered array is : ");
        printArr(array);
        
        quickSort(array, 0, array.length-1);
        System.out.println("After sorting the array is : ");
        printArr(array);
    }
}
