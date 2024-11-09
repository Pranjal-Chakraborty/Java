import java.util.ArrayList;

public class ReverseArrayList {
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println("The arraylist is : " + list);
        System.out.println("The arraylist in reverse order will be : ");
        
        System.out.print("[");
        for(int i = list.size() - 1; i >= 0; i--){
            System.out.print(list.get(i));
            if(i != 0){
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}