package LinkedList;

public class ReturnNthNodefromEnd {

    public static LinkedListNode<Integer> findNth(LinkedListNode<Integer> head, int n) {

        LinkedListNode<Integer> result = head;
        LinkedListNode<Integer> end = head;

        int count = 0;

        while (count < n) {
            end = end.next;
            count++;
        }

        while (end != null) {
            end = end.next;
            result = result.next;
            count++;
        }

        return result;
    }
}
