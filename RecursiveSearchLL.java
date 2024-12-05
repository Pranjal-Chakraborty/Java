import java.util.Scanner;

public class RecursiveSearchLL {
        
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data){
        Node newNode = new Node(data); // Create a new node
        size ++;
        if(head == null){
            head = tail = newNode;  // If the linked list was empthy then add the first node as head and tail of the linked list
            return;
        }
        newNode.next = head; // Assing the adress or reference of head to the next of the new node
        head = newNode; // Point the new node as head
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        size ++; 
        if(head == null){
            head = tail = newNode;  
            return;
        }
        tail.next = newNode; 
        tail = newNode; 
    }

    public void add(int index, int data){
        if(index == 0){
            addFirst(data); 
            return;
        }
        Node newNode = new Node(data); 
        size ++;
        Node temp = head;
        int i = 0;
        while(i < index - 1){
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }
    
    public void print(){
        if(head == null){
            System.out.println("The list is empty.");
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data);
            if(temp == tail){
                System.out.print(" -> NULL\n");
            }
            else{
                System.out.print(" -> ");
            }
            temp = temp.next;
        }
    }

    public int helper(Node head, int key){
        if(head == null){
            return -1;
        }
        if(head.data == key){
            return 0;
        }
        int idx = helper(head.next, key);
        if(idx == -1){
            return -1;
        }
        return idx + 1;
    }

    public int recSearch(int key){
        return helper(head, key);
    }

    public static void main(String[] args) {
        RecursiveSearchLL ll = new RecursiveSearchLL();
        Scanner scan = new Scanner(System.in);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);
        ll.add(2 , 69);
        ll.print();
        System.out.print("Enter the element you are looking for : ");
        int ele = scan.nextInt();
        scan.close();
        int result = ll.recSearch(ele);
        if(result >= 0){
            System.out.println(ele + " is present at the index " + result);
        }
        else{
            System.out.println(ele + " is not present in the linked list.");
        }
    }
}
