package LinkedList;

public class Partition {
    public static LL.Node partition(LL.Node head, int x) {
        LL.Node h1 = new LL.Node(0), t1 = h1;
        LL.Node h2 = new LL.Node(0), t2 = h2;
        while(head != null){
            if(head.value < x){
                t1.next = head;
                t1 = t1.next;
            } else{
                t2.next = head;
                t2 = t2.next;
            }
            head = head.next;
        }
        t1.next = h2.next;
        t2.next = null;
        return h1.next;
    }
    public static void main(String[] args) {
        LL.Node head = new LL.Node(1);
        head.next = new LL.Node(3);
        head.next.next = new LL.Node(2);
        head.next.next.next = new LL.Node(4);
        int x = 3;
        System.out.println(partition(head, x));
    }
}
