import java.util.Scanner;

public class Linear_search {

    public static int linear_search(int arr[], int n){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == n){
                return i;
            }
        }
        return -1;
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

        System.out.println("Enter which element to search : ");
        int key = scan.nextInt();
        scan.close();
        int index = linear_search(array, key);
        if( index >= 0){
            System.out.println(key + " is present in the array at index " + index);
        }
        else{
            System.out.println("The element is not present in the array.");
        }
    }
}
