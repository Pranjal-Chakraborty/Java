import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class PairSumSorted {
    public static int[] pairSum(ArrayList<Integer> arr, int key){
        Collections.sort(arr);
        int sum = 0;
        int lp = 0;
        int rp = arr.size() - 1;

        while(lp != rp){
            sum = arr.get(lp) + arr.get(rp);
            if(sum == key){
                return new int[]{lp, rp};
            }
            else if(sum < key){
                lp++;
            }
            else{
                rp--;
            }
        }

        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of your list : ");
        int size = scan.nextInt();
        System.out.println("Enter the elements of the List : ");
        for(int i = 0; i < size; i++){
            int val = scan.nextInt();
            array.add(val);
        }
        System.out.println("Enter the sum you are searching for : ");
        int target = scan.nextInt();
        scan.close();
        int[] result = pairSum(array, target);
        if(result[0] != -1){
            System.out.println("There is a pair in the list that gives the target sum and those elements are " + array.get(result[0]) + " and " + array.get(result[1]));
        }
        else{
            System.out.println("There is no pair in the list that gives the target sum.");
        }
    }
}
