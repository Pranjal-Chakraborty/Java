public class LinkedList{
    
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

    // public int removeFirst(){
    //     if(size == 0){
    //         System.out.println("The list is empty.");
    //         return Integer.MIN_VALUE;
    //     }
    //     else if(size == 1){
    //         int val = head.data;
    //         head = tail = null;
    //         size = 0;
    //         return val;
    //     }
    //     int val = head.data;
    //     head = head.next;
    //     size --;
    //     return val;
    // }

    public void removeFirst(){
        if(size == 0){
            System.out.println("The list is empty.");
        }
        else if(size == 1){
            System.out.println("Successfully removed " + head.data + " from the linked list.");
            head = tail = null;
            size = 0;
        }
        System.out.println("Successfully removed " + head.data + " from the linked list.");
        head = head.next;
        size --;
    }

    // public int removeLast(){
    //     if(size == 0){
    //         System.out.println("The list is empty.");
    //         return Integer.MIN_VALUE;
    //     }
    //     else if(size == 1){
    //         int val = head.data;
    //         head = tail = null;
    //         size = 0;
    //         return val;
    //     }
    //     Node prev = head;
    //     for(int i = 0; i < size - 2; i++){
    //         prev = prev.next;
    //     }
    //     int val = prev.next.data;
    //     tail = prev;
    //     prev.next = null;
    //     size --;
    //     return val;
    // }

    public void removeLast(){
        if(size == 0){
            System.out.println("The list is empty.");
        }
        else if(size == 1){
            System.out.println("Successfully removed " + head.data + " from the linked list.");
            head = tail = null;
            size = 0;
        }
        Node prev = head;
        for(int i = 0; i < size - 2; i++){
            prev = prev.next;
        }
        System.out.println("Successfully removed " + prev.next.data + " from the linked list.");
        tail = prev;
        prev.next = null;
        size --;
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
        LinkedList ll = new LinkedList();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);
        ll.add(2 , 69);
        System.out.print("The linked list is : ");
        ll.print();
        System.out.println("Size of the linkedlist is : " + LinkedList.size);
        ll.removeFirst();
        System.out.print("After removal of the head the new linked list is : ");
        ll.print();
        System.out.println("Size of the linkedlist is : " + LinkedList.size);
        ll.removeLast();
        System.out.print("After removal of the tail the new linked list is : ");
        ll.print();
        System.out.println("Size of the linkedlist is : " + LinkedList.size);
    }
}