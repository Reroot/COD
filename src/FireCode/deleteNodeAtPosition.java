package FireCode;

public class deleteNodeAtPosition {
//	Given a singly-linked list, implement a method to delete the node at a given position (starting from 1 as the head position) and return the head of the list. Do nothing if the input position is out of range.
//
//			Examples:
//
//			LinkedList: 1->2->3->4 , Head = 1
//
//			deleteAtMiddle(Head,3) ==> 1->2->4
// try 1, passing 3 cases, null issues	
	public ListNode deleteAtMiddle(ListNode head, int position) {
        ListNode curr = head;
        ListNode prev = null;
        int count = 0;
        if(head == null) return null;
        //if(position == 1) return head;
        while(count < position && curr.next != null) {//need better control here, remove internally
        	//as we are getting issues
            prev = curr;
            curr = curr.next;
            count++;
        }//break at prev
        if(count > position) return head;
        prev.next = curr.next;
        curr = null;
        
        return head;
        

}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
