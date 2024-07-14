package LinkedList;

import java.util.HashSet;

public class RemoveDuplicatesUnsorted {
    public static LL.Node removeDup(LL.Node head){
        if (head == null) return null;

        HashSet<Integer> set = new HashSet<>();
        LL.Node prev = null;
        LL.Node curr = head;
        while(curr != null){
            if(set.contains(curr.value)){
                prev.next = curr.next;
            } else {
                set.add(curr.value);
                prev = curr;
            }
            curr = curr.next;
        }
        return head;
    }

    public static void main(String[] args) {
        LL.Node head = new LL.Node(1);
        head.next = new LL.Node(3);
        head.next.next = new LL.Node(3);
        head.next.next.next = new LL.Node(4);
        head.next.next.next.next = new LL.Node(4);

        head = removeDup(head);
        printList(head);
    }

    public static void printList(LL.Node head) {
        LL.Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}