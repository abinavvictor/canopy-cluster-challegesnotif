package LinkedList;

public class twoNumberLinkedListAdditon {

    public class ListNode {
      int val;
      ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    public ListNode sum(ListNode l1 , ListNode l2){

        ListNode l3 = new ListNode(0);
        ListNode dummy = l3;

        int carry =0;

        while(l1 != null && l2 !=null) {

            int l1_val = l1 != null ? l1.val : 0;
            int l2_val = l2 != null ? l2.val : 0;

            int current_sum = l1_val+ l2_val+carry;
            carry = current_sum/10;
            int last_Digit = current_sum%10;

            ListNode newNode = new ListNode(last_Digit);

           l3.next = newNode;

           if(l1!=null) l1= l1.next;
           if(l2!= null) l2 = l2.next;
           l3 = l3.next;


        }
        if(carry >0)
        {
            ListNode  newNode = new ListNode(carry);

            l3.next = newNode;
            l3= l3.next;

        }

        return dummy;
    }
}
