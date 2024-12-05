public class HareAndTurtle {
            
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

    // Also known as Slow - Fast approach
    public Node findMid(Node head){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next; // +1
            fast = fast.next.next; 
        }
        return slow; // When my fast fully traverses the linked list then my slow will be at the middle node
    }

    public static void main(String[] args) {
        HareAndTurtle ll = new HareAndTurtle();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);
        ll.add(2 , 69);
        System.out.print("The linked list is : ");
        ll.print();
        Node result = ll.findMid(head);
        System.out.println("The middle node is : " + result.data);
    }
}
