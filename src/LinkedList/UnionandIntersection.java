package LinkedList;
import
import HashTables.LinkedListNode;

public class UnionandIntersection {
    public static <T> LinkedListNode<T> union(LinkedListNode<T> head1, LinkedListNode<T> head2) {
        if (head1 == null) return head2;
        if (head2 == null) return head1;

        LinkedListNode<T> current = head1;
        while (current.next != null) {
            current = current.next;
        }
        current.next = head2;

        removeDuplicates(head1);
        return head1;
    }

    // Helper function to remove duplicate nodes from a list
    public static <T> void removeDuplicates(LinkedListNode<T> head1) {
        if (head1 == null) return;

        LinkedListNode<T> outerNode = head1;
        while (outerNode != null) {
            LinkedListNode<T> innerNode = outerNode;
            while (innerNode.next != null) {
                if (outerNode.data.equals(innerNode.next.data)) {
                    innerNode.next = innerNode.next.next;
                } else {
                    innerNode = innerNode.next;
                }
            }
            outerNode = outerNode.next;
        }
    }

    // Function to compute intersection of two linked lists
    public static <T> LinkedListNode<T> intersection(LinkedListNode<T> head1, LinkedListNode<T> head2) {
        LinkedListNode<T> result = null;
        LinkedListNode<T> tail = null;
        LinkedListNode<T> current1 = head1;

        // Iterate over each node in the first list
        while (current1 != null) {
            LinkedListNode<T> current2 = head2;
            // Check if the current node in the first list exists in the second list
            while (current2 != null) {
                if (current1.data == current2.data && (!existsInResult(current1.data, result))) {
                    result = insertAtHead(result, current1.data);
                }
                current2 = current2.next;
            }

            current1 = current1.next;
        }

        return result;
    }

    // Function to check if a data value exists in the result list
    public static <T> boolean existsInResult(T data, LinkedListNode<T> head) {
        LinkedListNode<T> current = head;
        while (current != null) {
            if (current.data == data) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    // Helper function to insert a new node at the head of a list
    public static <T> LinkedListNode<T> insertAtHead(LinkedListNode<T> head, T data) {
        LinkedListNode<T> newNode = new LinkedListNode<>(data);
        newNode.next = head;
        return newNode;
    }
}
