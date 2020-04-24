/**
 * Definition for singly-linked list.
 * function ListNode(val) {
 *     this.val = val;
 *     this.next = null;
 * }
 */
/**
 * @param {ListNode} l1
 * @param {ListNode} l2
 * @return {ListNode}
 */
//recursion
var mergeTwoLists = function(l1, l2) {
	if (!l1 || !l2) return l1 ? l1 : l2;
	if (l1.val < l2.val) {
		l1.next = mergeTwoLists(l1.next, l2);
		return l1;
	} else {
		l2.next = mergeTwoLists(l1, l2.next);
		return l2;
	}
};
//iterative
var mergeTwoListsIter = function(l1, l2) {
	l3 = new ListNode(0);
	head = l3;

	while (l1 != null && l2 != null) {
		if (l1.val < l2.val) {
			head = l1.val;
			head.next = new ListNode(0);
			l1 = l1.next;
		} else if (l1.val > l2.val) {
			head = l2.val;
			head.next = new ListNode(0);
			l1 = l1.next;
		}
	}
	l1 === null ? (l1.next = l2) : (l1.next = l2);
	l2 === null ? (l2.next = l1) : (l2.next = l1);
	return head;
	//handel the rest by connecting the lesser becuase it's already sorted
};
