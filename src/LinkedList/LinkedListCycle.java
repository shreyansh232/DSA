package LinkedList;

public class LinkedListCycle {
    public static boolean hasCycle(LL.Node head) {
        LL.Node slow = head;
        LL.Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        }
        return false;

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
        System.out.println(hasCycle(head));

    }
}
