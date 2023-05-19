import java.util.LinkedList;

public class NeetCode06_LinkedList {

    /** 206. Reverse Linked List, O(n) */
    public ListNode reverseList(ListNode head) {
        // a -> b -> c -> null
        // null <- a <- b <- c <-

        ListNode previous = null;

        while(head != null) {
            ListNode nextHead = head.next;
            head.next = previous;
            previous = head;
            head = nextHead;
        }
        return previous;
    }
}


class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

