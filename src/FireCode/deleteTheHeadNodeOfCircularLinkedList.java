package FireCode;

public class deleteTheHeadNodeOfCircularLinkedList {
	public ListNode deleteAtHead(ListNode head) {
        //we need the node before head and the node after head
        if(head == null) return null;
        if(head.next == head) return null;
        
        ListNode prev = null;
        ListNode curr = head;

        while(curr != null) {
            prev = curr;
            curr = curr.next;
            if(prev.next == head) {
                prev.next = curr.next;
                curr = null;
                return prev.next;
            }
        }
        return prev; 
}
//	Given a circular linked list, implement a method to delete its head node. Return the list's new head node.
//
//	*x = indicates head node
//	1->2->3->4->*1 ==> 2->3->4->*2
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
