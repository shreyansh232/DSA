package LinkedList;

public class FindMiddleNode {
    public static int findMiddleNode(LL.Node head){
        LL.Node fast = head;
        LL.Node slow = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow.value;
    }
    public static void main(String[] args) {
        LL.Node head = new LL.Node(1);
        head.next = new LL.Node(3);
        head.next.next = new LL.Node(2);
        head.next.next.next = new LL.Node(4);
        System.out.println(findMiddleNode(head));

    }
}
