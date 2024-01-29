import java.util.*;

public class Binary_search {

    public static int binary_search(int arr[], int n){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = (start+end)/2;
            if(arr[mid] == n){
                return mid;
            }
            else if(arr[mid] > n){
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array : ");
        int len = scan.nextInt();

        int array[] = new int[len];

        System.out.println("Enter the elements of the array in sorted order : ");
        for(int i = 0; i < len; i++){
            array[i] = scan.nextInt();
        }

        System.out.println("Enter which element to search : ");
        int key = scan.nextInt();
        scan.close();
        int index = binary_search(array, key);
        if( index >= 0){
            System.out.println(key + " is present in the array at index " + index);
        }
        else{
            System.out.println("The element is not present in the array.");
        }
    } 
}
