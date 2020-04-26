package LinkedLists;


class swapPairs {
    public static ListNode swapPairs(ListNode head) {
        //go though and swap nodes but not the pointers
        //preserve the orional 
        ListNode dummy = new ListNode(0);//PATTERN TO ACCESS the full head node
        dummy.next = head;//HERE WE LINK the Dummy to use
        ListNode curr = dummy;//HERE WE USE it
        while(curr.next != null && curr.next.next != null) {
            ListNode first = curr.next;//0->1
            ListNode sec = curr.next.next;//1->2
            //save the two node, exactly at 0 and 1
            //now swap the pointer, so 2 points to 1
            first.next = sec.next;//so now have 2 point to 1 instead of 3//NOW 1 POINTS TO 3 AS next
            curr.next = sec;
            curr.next.next = first;//USE the new 1 switched, it's ahead now, we can set it to curr to coiuint
            //our iteration from first;
            curr = curr.next.next;//go to the pointer of, [2]->1->3
        }
        return dummy.next;
    }
    public static void main(String[] args) {
			ListNode r = new ListNode(1);
			r.next = new ListNode(2);
			r.next.next = new ListNode(3);
			r.next.next.next = new ListNode(4);
			r.next.next.next.next = new ListNode(5);
		    System.out.println(swapPairs(r));
	}

}
