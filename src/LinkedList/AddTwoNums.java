package LinkedList;

public class AddTwoNums {
    public static LL.Node addTwoNumbers(LL.Node l1, LL.Node l2) {
        LL.Node dummy = new LL.Node(0);
        LL.Node res = dummy;
        int total = 0, carry = 0;
        while(l1 != null || l2 != null || carry != 0){
            total = carry;
            if(l1 != null){
                total += l1.value;
                l1 = l1.next;
            }
            if(l2 != null){
                total += l2.value;
                l2 = l2.next;
            }
            int num = total % 10;
            carry = total / 10;
            dummy.next = new LL.Node(num);
            dummy = dummy.next;
        }

        return res.next;

    }
    public static void main(String[] args) {
        LL.Node head = new LL.Node(1);
        head.next = new LL.Node(3);
        head.next.next = new LL.Node(2);
        head.next.next.next = new LL.Node(4);
        LL.Node head2 = new LL.Node(1);
        head2.next = new LL.Node(3);
        head2.next.next = new LL.Node(2);
        head2.next.next.next = new LL.Node(4);
        System.out.println(addTwoNumbers(head, head2));

    }
}
