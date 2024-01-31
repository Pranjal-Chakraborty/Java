import java.util.*;

public class Trappedwater {

    public static int water(int arr[], int w) {
        int n = arr.length;
        
        //Calculate left max boundary
        int leftmax[] = new int[n];
        leftmax[0] = arr[0];
        for(int i = 1; i < n; i++){
            leftmax[i] = Math.max(arr[i],leftmax[i-1]);
        }

        //Calculate right max boundary
        int rightmax[] = new int[n];
        rightmax[n-1] = arr[n-1];
        for(int i = n-2; i >= 0; i--){
            rightmax[i] = Math.max(arr[i],rightmax[i+1]);
        }

        int trappedwater = 0;
        
        //Loop
        for(int i =0; i < n; i++){
            //Waterlevel = min(leftmaxbound,rightmaxbound)
            int waterlevel = Math.min(leftmax[i],rightmax[i]);
            //Trappedwater = Waterlevel - Bar height
            trappedwater += (waterlevel - arr[i]) * w;
        }
        return trappedwater;
    }
        public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of bars : ");
        int len = scan.nextInt();

        int array[] = new int[len];

        System.out.println("Enter the heights of the bars : ");
        for(int i = 0; i < len; i++){
            array[i] = scan.nextInt();
        }
        System.out.println("Enter the width of the bars : ");
        int width = scan.nextInt();
        scan.close();
        
        int amount = water(array,width);
        System.out.println("The amount of water which is trapped in the gaps is : " + amount);
    }
}
