package LinkedList;

public class MiddleofLinkedList {
    public static LinkedListNode<Integer> findMiddle(LinkedListNode<Integer> head) {

        LinkedListNode<Integer> mid = head;
        LinkedListNode<Integer> fast = head;

        while (fast != null && fast.next != null) {
            mid = mid.next;
            fast = fast.next.next;
        }
        return mid;
    }
}
