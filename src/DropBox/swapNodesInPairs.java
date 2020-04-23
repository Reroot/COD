package DropBox;
class ListNode {
	int data;
	ListNode next;
	public ListNode(int data, ListNode next) {
		this.next = next;
		this.data = data;
	}
}
public class swapNodesInPairs {
    public ListNode swapPairs2(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode cur = head;
        ListNode newHead = head.next;
        while (cur != null && cur.next != null) {
            ListNode tmp = cur;
            cur = cur.next;
            tmp.next = cur.next;
            cur.next = tmp;
            cur = tmp.next;
            if (cur != null && cur.next != null) tmp.next = cur.next;
        }
        return newHead;
    }
	public swapNodesInPairs() {
		// TODO Auto-generated constructor stub
	}
    public ListNode swapPairs(ListNode head) {
        if ((head == null)||(head.next == null))
            return head;
        ListNode n = head.next;
        head.next = swapPairs(head.next.next);
        n.next = head;
        return n;
    }
	public static void main(String[] args) {
		ListNode

	}

}
