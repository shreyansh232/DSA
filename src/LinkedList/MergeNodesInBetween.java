package LinkedList;
public class MergeNodesInBetween {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
        @Override
        public String toString() {
            return val + "->" + next;
        }
    }
    public static ListNode mergeNodes(ListNode head) {
        // Skip the first 0 (list head) as it's a sentinel
        head = head.next;

        ListNode start = head;
        while (start != null) {
            ListNode temp = start;
            int sum = 0;

            // Traverse until a 0 is encountered
            while (temp.val != 0) {
                sum += temp.val;
                temp = temp.next;
            }

            // Update the current node's value with the sum
            start.val = sum;

            // Skip all nodes until the next non-zero node (after the 0)
            start.next = temp.next;

            // Move on to the next non-zero node (potential start of next segment)
            start = temp.next;
        }

        return head;
    }
    public static void main(String[] args) {
        MergeNodesInBetween s = new MergeNodesInBetween();
        // [4,11]
        System.out.println(mergeNodes(
                new ListNode(0, new ListNode(3, new ListNode(1, new ListNode(0, new ListNode(4, new ListNode(5, new ListNode(2, new ListNode(0))))))))
        ));
    }
}
