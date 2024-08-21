import java.util.Scanner;

public class FirstOccurence {
    
    public static int isPresent(int arr[], int key, int i){
       if (i == arr.length){
        return -1;
       }
       if(arr[i] == key){
        return i;
       }
       return isPresent(arr, key, i+1);
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
         
        System.out.println("The given array is :");
        for(int i = 0; i < len; i++){
            System.out.print(arr[i] + " ");
            if(i == len-1){
                System.out.println();
            }
        }
        
        System.out.println("Enter the element to be found : ");
        int k = scan.nextInt();
        scan.close();
        
        int result = isPresent(arr, k, 0);
        if(result < 0){
            System.out.println("The element is not present in the array.");
        }
        else{
            System.out.println("The fisrt occurence of the element in the array is at index " + result);
        }

    }
}
