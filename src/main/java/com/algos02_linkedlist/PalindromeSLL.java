package com.algos02_linkedlist;

public class PalindromeSLL {
    public static void main(String[] args) {
        System.out.println("Palindrome verification program");
        ListNode head = ListNode.getPalidromeSLL();
        ListNode.displaySLL();
        boolean isPalidrome = isPalindrome(head);
        if(isPalidrome) System.out.println("The linked list is palindrome");
        else System.out.println("The linked list isn't palindrome");
        ListNode.displaySLL();
    }

    private static boolean isPalindrome(ListNode originalHead) {
        ListNode slow = originalHead,
                fast= originalHead.next,
                head = originalHead.next,
                prev = null;
        while (fast != null && fast.next != null) {
            slow=slow.next;
            if(fast.next.next == null)fast = fast.next;
            else fast=fast.next.next;
            head = head.next;
        }
        System.out.println("slow:"+slow.val +" fast:"+fast.val +" head:"+head.val);
        //reverse the linked list
        while (slow != null) {
            slow.next = prev;
            prev = slow;
            slow = head;
            if(head!=null)head = head.next;
        }
        fast.display(fast);
        //Node to node data comparison
        slow = originalHead;
        while (fast!=null){
            if(fast.val !=slow.val)break;
            slow = slow.next;
            fast = fast.next;
        }

        ListNode reversePtr1=prev,reversePtr2 = prev.next;
        prev=null;
        //re-reversing the second half linked list to get the original one
        while (reversePtr1 != null) {
            reversePtr1.next=prev;
            prev=reversePtr1;
            reversePtr1=reversePtr2;
            if(reversePtr2!=null)reversePtr2=reversePtr2.next;
        }
        if(fast==null)
        return true;
        else return false;
    }
}
