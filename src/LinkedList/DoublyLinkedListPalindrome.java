package LinkedList;


public DoublyLinkedListNode{

}
public class DoublyLinkedListPalindrome {
    public static boolean isPalindrome(DoublyLinkedListNode head) {
        DoublyLinkedListNode start = head;
        DoublyLinkedListNode end = getTailNode(head);

        // If list is empty, it is a palindrome
        if (start == null) {
            return true;
        }

        // Otherwise, traverse list from both sides
        while (start != end && start.prev != end) {
            // If data mismatches at any point, list is not a palindrome
            if (start.data != end.data) {
                return false;
            }
            start = start.next;
            end = end.prev;
        }

        // If data didn't mismatch at any point, list is a palindrome
        return true;
    }

    public static DoublyLinkedListNode getTailNode(DoublyLinkedListNode head) {
        DoublyLinkedListNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        return temp;
    }

}
