public class ReverseLLitr {
            
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

    public void reverse(){
        Node prev = null;
        Node curr = tail = head;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }
    
    public static void main(String[] args) {
        ReverseLLitr ll = new ReverseLLitr();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);
        ll.add(2 , 69);
        System.out.print("Before reversal the linked list is : ");
        ll.print();
        ll.reverse();
        System.out.print("After reversal the linked list is : ");
        ll.print();
    }
}
