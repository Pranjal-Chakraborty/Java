import java.util.*;

public class Large_small_value_array {

    public static int getLargest(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i< arr.length; i++){
            if(largest < arr[i]){
                largest = arr[i];
            }
        }
        return largest;
    }

    public static int getSmallest(int arr[]){
        int smallest = Integer.MAX_VALUE;
        for(int i = 0; i< arr.length; i++){
            if(smallest > arr[i]){
                smallest = arr[i];
            }
        }
        return smallest;
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

        int large_value = getLargest(array);
        System.out.println("The largest element of the array is " + large_value);

        int small_value = getSmallest(array);
        System.out.println("The smallest element of the array is " + small_value);
    }
}
