package HashTables;
import java.util.*;
public class RemovingDuplicatesFromLinkedList {
    public static LinkedListNode<Integer> removeDuplicates(LinkedListNode<Integer> head) {
        LinkedListNode<Integer> currentNode = head;
        LinkedListNode<Integer> prevNode = head;
        //will store all the elements that we observe once
        HashSet<Integer> visitedNodes = new HashSet<>();

        if (head!=null && currentNode.next != null) {
            while (currentNode != null) {
                //check if already visited then delete this node
                if (visitedNodes.contains(currentNode.data)) {
                    //deleting the node by undating the pointer of previous node
                    prevNode.next = currentNode.next;
                    currentNode = currentNode.next;
                } else {
                    //if node was not already visited then add it to the visited set
                    visitedNodes.add(currentNode.data);
                    //moving on to next element in the list
                    prevNode = currentNode;
                    currentNode = currentNode.next;
                }
            }
        }
        return head;
    }

}
