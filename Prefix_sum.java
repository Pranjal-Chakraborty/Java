import java.util.*;

public class Prefix_sum {
        public static void subarray_sum(int arr[]){
        int sum = 0;
        int maxsum = Integer.MIN_VALUE;
        int minsum = arr[0];
        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];
        for(int i = 1; i < arr.length; i++){
            prefix[i] = prefix[i-1] + arr[i];
        }
        for(int i = 0; i < arr.length ; i++){
            for(int j = i; j < arr.length ; j++){
                sum = i == 0?prefix[j] : prefix[j] - prefix[i-1];
                if(maxsum < sum){
                    maxsum = sum;
                }
                else if(minsum > sum){
                    minsum = sum;
                }
            }
        }
        System.out.println("Max sum is : " + maxsum);
        System.out.println("Min sum is : " + minsum);
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
