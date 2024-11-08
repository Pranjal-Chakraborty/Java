import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) { 
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);
        System.out.println("The size of the arraylist is : " + list.size());
        System.out.println("The element in 4th position of the arraylist is : " + list.get(3));
        System.out.println("Before adding 6 at the 4th position the arraylist was : " + list);
        list.set(3,6);
        System.out.println("After adding 6 at the 4th position the arraylist is : " + list);
        list.remove(3);
        System.out.println("After removing the element at the 4th position the arraylist is : " + list);
    }
}