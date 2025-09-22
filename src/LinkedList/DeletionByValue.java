package LinkedList;

public class DeletionByValue {
    public static boolean deleteByValue(LinkedListNode <Integer> head, int value) {
        boolean deleted = false;

        LinkedListNode <Integer> current = head;
        LinkedListNode <Integer> previous = null;
        // Check if the value to delete is in the head node
        if (current.data == value) {
            head = head.next;
            deleted = true;
            return deleted;
        }

        // Traverse the linked list to find the node with the given value
        while (current != null) {
            if (value == current.data) { // If the value is found
                previous.next = current.next;
                current.next = null;
                deleted = true;
                break;
            }
            previous = current;
            current = current.next;
        }
        return deleted;
    }
}

//With Linked List deletions adjust references carefullu like this
// prev.next =current.next
//prev= current
//current = current.next