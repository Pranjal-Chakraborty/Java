import java.util.Scanner;

public class Subarray_sum_brute {
    public static void subarray_sum(int arr[]){
        int sum = 0;
        int maxsum = Integer.MIN_VALUE;
        int minsum = 0;
        for(int i = 0; i < arr.length ; i++){
            for(int j = i; j < arr.length ; j++){
                sum = 0;
                for(int k = i; k <= j ; k++){
                    sum += arr[k];
                }
                System.out.println("The sum is : " + sum);
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
