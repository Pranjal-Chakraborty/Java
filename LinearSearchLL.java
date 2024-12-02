import java.util.Scanner;

public class LinearSearchLL {
    
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

    public int search(int key){
        int idx = 0;
        Node temp = head;
        while(temp != null){
            if(temp.data == key){
                return idx;
            }
            temp = temp.next;
            idx ++;
        }
        return -1;
    }
    public static void main(String[] args) {
        LinearSearchLL ll = new LinearSearchLL();
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
        int result = ll.search(ele);
        if(result >= 0){
            System.out.println(ele + " is present at the index " + result);
        }
        else{
            System.out.println(ele + " is not present in the linked list.");
        }
    }
}
