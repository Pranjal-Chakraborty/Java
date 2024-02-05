import java.util.*;

public class Countsort {
    public static void countingsort(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            largest = Math.max(largest,arr[i]);
        }
        
        int count[] = new int[largest+1];
        for(int i = 0; i < arr.length; i++){
            count[arr[i]]++;
        }

        int j =0;
        for(int i = 0; i < count.length; i++){
            while(count[i] > 0){
                arr[j] = i;
                j++;
                count[i]--;
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
        countingsort(array);
    }
}
