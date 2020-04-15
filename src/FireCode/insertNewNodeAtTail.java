package FireCode;

public class insertNewNodeAtTail {
//	Write a method to insert a node at the end of a singly-linked list. Return the head of the modified list.
//	Examples:
//
//	LinkedList: 1->2 , Head = 1
//
//	InsertAtTail(Head,1) ==> 1->2->1
//	InsertAtTail(Head,2) ==> 1->2->2
//	InsertAtTail(Head,3) ==> 1->2->3
//	
	public ListNode insertAtTail(ListNode head, int data) {
	    ListNode newNode = new ListNode(data);
	    ListNode curr = head;
	    if(curr == null) return newNode;
	    while(curr.next != null) {
	        curr = curr.next;
	    }
	    curr.next = newNode;
	    return head; 
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
//LinkedList: null
//Node to be inserted: 1
//1
//1
//      Pass
//LinkedList: 1
//Node to be inserted: 2
//1->2
//1->2
//      Pass
//LinkedList: 1->2
//Node to be inserted: 3
//1->2->3
//1->2->3
//      Pass