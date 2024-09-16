package org.example;


import java.util.Stack;

public class LinkedListPalindrom {

    // 1,2,3,2,1
    // 1,2,2,1
    //1,2,1
    //1
    //1,2
    //1,2,3,4,5,6,7,8
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public boolean isPalindrome(ListNode head) {
        ListNode fast = head, slow =head;
        Stack<Integer> nodeValueStack = new Stack<>();

        while (fast!=null && fast.next!=null) {
            nodeValueStack.push(slow.val);
            slow=slow.next;
            fast = fast.next.next;
        }
        ListNode middle = slow;
        if(fast!=null) nodeValueStack.push(middle.val);
        boolean isPalindrom = true;
        while(middle!=null) {
            if(nodeValueStack.pop()!=middle.val) {
                isPalindrom=false;
                break;
            }
            middle = middle.next;
        }
        return isPalindrom;
    }

    public static void main(String[] args) {

    }



}
