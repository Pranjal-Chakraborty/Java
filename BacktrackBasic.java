import java.util.Scanner;

public class BacktrackBasic{
    
    public static void printArr(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
    public static void changeArr(int arr[], int i, int val){
        
        //Base case
        if(i == arr.length){
            System.out.println("The array elements in ascending order is : ");
            printArr(arr);
            return;
        }

        //Recursion
        arr[i] = val;
        changeArr(arr, i + 1, val + 1); //Function call
        arr[i] -= 2; // Backtrack step
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the length of the array : ");
        int length = scan.nextInt();
        System.out.println("Enter the first element of the array :");
        int firstEle = scan.nextInt();
        scan.close();
        int array[] = new int[length];
        System.out.println("After changes the array is : ");
        changeArr(array, 0, firstEle);
        printArr(array);
    }
}