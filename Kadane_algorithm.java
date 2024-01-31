import java.util.*;

public class Kadane_algorithm {
    public static void subarray_sum(int arr[]){
        int sum = 0;
        int maxsum = Integer.MIN_VALUE;
        int maxele = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length ; i++){
            sum += arr[i];
            if(sum < 0){
                sum = 0;
            }
            maxele = Math.max(maxele,arr[i]);
            maxsum = Math.max(sum, maxsum);
            if(maxsum == 0){
                maxsum = maxele;
            }
        }
        System.out.println("Max subarray sum is : " + maxsum);
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
        subarray_sum(array);
    }
}
