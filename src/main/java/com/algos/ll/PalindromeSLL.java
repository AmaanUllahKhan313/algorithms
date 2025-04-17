package com.algos.ll;

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

    private static boolean isPalindrome(ListNode head) {
        ListNode ptr1 = head,ptr2= head.next,ptr3 = head.next,prev = null;
        while (ptr2 != null && ptr2.next != null) {
            ptr1=ptr1.next;
            if(ptr2.next.next == null)ptr2 = ptr2.next;
            else ptr2=ptr2.next.next;
            ptr3 = ptr3.next;
        }
        System.out.println("ptr1:"+ptr1.val +" ptr2:"+ptr2.val +" ptr3:"+ptr3.val);
        //reverse the linked list
        while (ptr1 != null) {
            ptr1.next = prev;
            prev = ptr1;
            ptr1 = ptr3;
            if(ptr3!=null)ptr3 = ptr3.next;
        }
        ptr2.display(ptr2);
        //Node to node data comparison
        ptr1 = head;
        while (ptr2!=null){
            if(ptr2.val !=ptr1.val)break;
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
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
        if(ptr2==null)
        return true;
        else return false;
    }
}
