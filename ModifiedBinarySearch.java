import java.util.Scanner;

public class ModifiedBinarySearch{
    public static int search(int arr[], int key, int si, int ei){
        
        if(si > ei){
            return -1;
        }
        
        int mid = si + (ei - si)/2;
        
        //If the value is in mid
        if(arr[mid] == key){
            return mid;
        }
        
        //If the value is in line 1
        if(arr[si] <= arr[mid]){
           if(arr[si] <= key && key <= arr[mid]){
               return search(arr, key, si, mid - 1);
           }
           else{
               return search(arr, key, mid + 1, ei);
           }
        }

        //If the value is in line 2
        else{
            if(arr[mid] <= key && key <= arr[ei]){
                return search(arr, key, mid + 1, ei);
            }
            else{
                return search(arr, key, si, mid - 1);
            }
        }
    }

    public static void main(String args[]) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array : ");
        int len = scan.nextInt();

        int array[] = new int[len];

        System.out.println("Enter the elements of a sorted and rotated array : ");
        for(int i = 0; i < len; i++){
            array[i] = scan.nextInt();
        }

        System.out.println("Enter which element to search : ");
        int key = scan.nextInt();
        scan.close();
        int index = search(array, key, 0, len - 1);
        if( index >= 0){
            System.out.println(key + " is present in the array at index " + index);
        }
        else{
            System.out.println("The element is not present in the array.");
        }
    }
}