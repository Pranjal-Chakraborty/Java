public class CheckPalindromeLL {
                
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

    public boolean checkPalindrome(){
        if(head == null || head.next == null){
            return true;
        }
        
        // Step 1 :- Find the middle of the linked list
        Node midNode = findMid(head);
        
        // Step 2 :- Reverse the 2nd half of the linked list 
        Node prev = null;
        Node curr = midNode;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // Step 3 :- Check if left half == right half
        Node left = head; // Head of the left half
        Node right = prev; // Head of the right half
        while(right != null){
            if(left.data != right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }

    public static void main(String[] args) {
        CheckPalindromeLL ll = new CheckPalindromeLL();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(2);
        ll.addLast(1);
        //ll.add(2 , 69);
        System.out.print("The linked list is : ");
        ll.print();
        boolean result = ll.checkPalindrome();
        if(result == true){
            System.out.println("The given linked list is a palindrome.");
        }
        else{
            System.out.println("The given linked list is not a palindrome.");
        }
    }
}
