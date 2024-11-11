import java.util.*;

public class WaterContainer {
    
    public static int storeWater(ArrayList<Integer> list){
        int maxWater = 0;
        int leftPointer = 0;
        int rightPointer = list.size() - 1;
        while(leftPointer < rightPointer){
            int height = Math.min(list.get(leftPointer), list.get(rightPointer));
            int  width = rightPointer - leftPointer;
            int currentWater = height * width;
            maxWater = Math.max(maxWater, currentWater);

            if(list.get(leftPointer) < list.get(rightPointer)){
                leftPointer ++;
            }
            else{
                rightPointer --;
            }
        }
        return maxWater;
    }

    public static void main(String[] args) {
        ArrayList<Integer> heights = new ArrayList<>();
        heights.add(1); heights.add(8); heights.add(6); heights.add(2); heights.add(5); heights.add(4); heights.add(8); heights.add(3); heights.add(7);
        System.out.println("The maximum amount of water that can be stored in the container is : " + storeWater(heights) + " units.");
    }
}
