package LinkedList;

public class LengthOfLinkedList {
    public static int length(LinkedListNode <Integer> head) {
        int count = 0;// Initialize count to 0
        LinkedListNode <Integer> current = head; // Initialize current to the head of the linked list
        // Traverse the linked list and count the number of nodes
        while (current != null) {
            count++;
            current = current.next;
        }

        return count;
    }
}
