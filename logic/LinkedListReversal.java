package logic;

public class LinkedListReversal {
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode revList(ListNode head) {
        ListNode prev = null;
        ListNode cuListNode = head;
        ListNode next = null;

        while (cuListNode != null) {
            next = cuListNode.next;
            cuListNode.next = prev;
            prev = cuListNode;
            cuListNode = next;
        }
        return prev;
    }

    public void print(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedListReversal obj = new LinkedListReversal();

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(8);
        head.next.next.next = new ListNode(6);

        System.out.println("Original list:");
        obj.print(head);

        ListNode newlist = obj.revList(head);

        // --- THE FIX ---
        // Call the print method to display the reversed list's contents.
        System.out.println("Reversed list:");
        obj.print(newlist);
    }
}
