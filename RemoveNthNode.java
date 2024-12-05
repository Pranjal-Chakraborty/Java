import java.util.Scanner;

public class RemoveNthNode {
        
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

    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data){
        Node newNode = new Node(data);
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
        Node temp = head;
        int i = 0;
        while(i < index - 1){
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void removeNthNodefromEnd(int n){

        int size = 0;
        Node temp = head;
        while(temp != null){
            temp = temp.next;
            size ++;
        }

        if(n == 0){
            System.out.println("Can not remove the element as it is already empty.");
            return;
        }

        if (n == size){
            head = head.next;
            return;
        }

        int i = 1;
        int target = size - n;
        Node prev = head;
        while(i < target){
            prev = prev.next;
            i ++;
        }
        
        prev.next = prev.next.next;
        return;
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

    public static void main(String[] args) {
        RemoveNthNode ll = new RemoveNthNode();
        Scanner scan = new Scanner(System.in);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);
        ll.add(2 , 69);
        System.out.print("The linked list is : ");
        ll.print();
        System.out.println("Enter the position of the node from the End which you want to remove : ");
        int position = scan.nextInt();
        scan.close();
        ll.removeNthNodefromEnd(position);
        System.out.print("After removing the element the Linked list is : ");
        ll.print();
    }
}
