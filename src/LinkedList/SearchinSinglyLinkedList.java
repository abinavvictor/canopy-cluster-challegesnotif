package LinkedList;

public class SearchinSinglyLinkedList {

    public static boolean searchNode(LinkedListNode <Integer> head, int value) {

        //Start from first element
        LinkedListNode<Integer> currentNode = head;

        //Traverse the list till you reach end
        while (currentNode != null) {

            if (currentNode.data == value) return true; //value found
            currentNode = currentNode.next;
        }
        return false; //value not found
    }
}
