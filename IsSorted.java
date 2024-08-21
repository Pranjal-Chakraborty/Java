import java.util.*;

public class IsSorted {
    
    public static boolean isSorted(int arr[], int i){
        if(i == arr.length-1){
            return true;
        }
        if(arr[i] > arr[i+1]){
            return false;
        }
        return isSorted(arr, i+1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the length of the array : ");
        int len = scan.nextInt();

        int arr[] = new int[len];

        System.out.println("Enter the elements of the array : ");
        for(int i = 0; i < len; i++){
            arr[i] = scan.nextInt();
        }
        scan.close();
        
        System.out.println("The given array is :");
        for(int i = 0; i < len; i++){
            System.out.print(arr[i] + " ");
            if(i == len-1){
                System.out.println();
            }
        }

        if(isSorted(arr,0)){
            System.out.println("The given array is sorted.");
        }
        else{
            System.out.println("The given array is not sorted.");
        }
    }
}
