import java.util.*;

public class SwapArrList {
    
    public static void swap(ArrayList<Integer> list, int a, int b){
        int temp = list.get(a);
        list.set(a, list.get(b));
        list.set(b, temp);
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);

        System.out.println("Before swapping the arraylist is : " + list);
        Scanner scan = new Scanner(System.in);
        System.out.print("Position 1 = ");
        int ind1 = scan.nextInt();
        System.out.print("Position 2 = ");
        int ind2 = scan.nextInt();
        scan.close();
        swap(list, ind1, ind2);
        System.out.println("After swapping the elements of index " + ind1 + " and " + ind2 + " the arraylist is : " + list);
    }
}
