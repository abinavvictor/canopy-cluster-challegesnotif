package LinkedList;

public class InsertionAtTail {
    public static LinkedListNode<Integer> insertAtTail(LinkedListNode<Integer> head, int value) {
        LinkedListNode<Integer> newNode = new LinkedListNode<Integer>(value);

        // New node will become the head node if there
        // are no elements in the linked list
        if (head == null) {
            head = newNode;
        } else {
            LinkedListNode<Integer> current = head;

            // Iterate over the linked list using current
            while (current.next != null) {
                current = current.next;
            }

            // Append a new node at the end of the linked list
            current.next = newNode;
        }

        return head;
    }

}
