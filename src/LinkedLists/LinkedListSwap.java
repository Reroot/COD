package LinkedLists;

import java.io.*;
import java.util.*;

/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
 */
//class ListNode {
//  int data;
//  ListNode next;
//  
//  ListNode(int x) {
//    this.data = x;
//    //Input:  (1) -> (2) -> (3) -> (4) -> (5)
//    //Output: (2) -> (1) -> (4) -> (3) -> (5)
//  }
//  
//}
class LinkedListSwap {
  public static void main(String[] args) {
    ListNode r = new ListNode(1);
    r.next = new ListNode(2);
    r.next.next = new ListNode(3);
    r.next.next.next = new ListNode(4);
    r.next.next.next.next = new ListNode(5);
    
    System.out.println(swap(r));
  }
  
  public static ListNode swap(ListNode root) {

    ListNode dummy = new ListNode(0);
    dummy.next = root;
    ListNode curr = dummy;

    System.out.println("swap");
    while(curr != null && curr.next != null) {
        System.out.println("iteration");
        ListNode first = curr.next;
        ListNode second = curr.next.next;
        first.next = second.next;
        curr.next = second;
        curr.next.next = first;
      
        curr = curr.next.next;
      
      
    }
    return dummy.next;
  }
}