package LinkedList;
public class ReverseLinkedList {
    public static LL.Node reverse(LL.Node head){

        //Recursive
        if(head == null || head.next == null){
            return head;
        }
        LL.Node newHead = reverse(head.next);

        head.next.next = head;
        head.next = null;
        return newHead;

        //Iterative
//        LL.Node prev = null;
//        LL.Node current = head;
//
//        while (current != null) {
//            LL.Node nextNode = current.next; // Store the next node
//            current.next = prev;              // Reverse the current node's pointer
//            prev = current;                   // Move the prev pointer one step forward
//            current = nextNode;               // Move the current pointer one step forward
//        }
//
//        return prev; // prev will be the new head of the reversed list
    }
    public static void printLinkedList(LL.Node head) {
        LL.Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LL.Node head = new LL.Node(1);
        head.next = new LL.Node(3);
        head.next.next = new LL.Node(2);
        head.next.next.next = new LL.Node(4);

        System.out.print("Original Linked List: ");
        printLinkedList(head);

        head = reverse(head);

        System.out.print("Reversed Linked List: ");
        printLinkedList(head);

    }
}
