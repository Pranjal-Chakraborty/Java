import java.util.Scanner;

public class Reverse_array {

    public static void reverse(int arr[]){
        int start = 0, end = arr.length-1;
       while(start < end){
        int temp = arr[end];
        arr[end] = arr[start];
        arr[start] = temp;
        start ++;
        end --;
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

        System.out.println("Before reversing the array elements are : ");
        for(int i = 0; i < len; i++){
            System.out.print(array[i] + " ");
        }

        System.out.println();
        reverse(array);

        System.out.println("After reversing the array elements are : ");
        for(int i = 0; i < len; i++){
            System.out.print(array[i] + " ");
        }
    }
}
