package LinkedList;
import HashTables.LinkedListNode

public class RemoveDuplicatesfromLinkedList {
    public static LinkedListNode<Integer> removeDuplicates(LinkedListNode<Integer> head) {
        // Check if list is empty or has only one node
        if (head == null || head.next == null) {
            return head;
        }

        LinkedListNode<Integer> outerNode = head;

        // Traverse the linked list to find duplicates
        while (outerNode != null) {
            LinkedListNode<Integer> innerNode = outerNode;

            while (innerNode != null && innerNode.next != null) {
                if (outerNode.data.equals(innerNode.next.data)) {
                    innerNode.next = innerNode.next.next;
                } else {
                    innerNode = innerNode.next;
                }
            }
            outerNode = outerNode.next;
        }

        return head;
    }
}
