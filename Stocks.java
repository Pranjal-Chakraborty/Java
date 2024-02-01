import java.util.*;

public class Stocks {

    public static int stocks(int arr[]){
        int buyprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for(int i = 0; i < arr.length; i++){
            if(buyprice < arr[i]){
                int profit = arr[i] - buyprice;
                maxprofit = Math.max(maxprofit,profit);
            }
            else{
                buyprice = arr[i];
            }
        }
        return maxprofit;
    }
        public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of days : ");
        int len = scan.nextInt();

        int array[] = new int[len];

        System.out.println("Enter the stock prices of each day : ");
        for(int i = 0; i < len; i++){
            array[i] = scan.nextInt();
        }
        scan.close();
        
        int amount = stocks(array);
        System.out.println("The max profit from these stocks will be : " + amount);
    }
}
