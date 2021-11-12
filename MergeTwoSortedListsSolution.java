//Merge two sorted linked lists and return it as a sorted list.
// The list should be made by splicing together the nodes of the first two lists.
//Level: easy

//I've learned this solution by checking problem's discussions
//Runtime: 0
//Memory: 38.5 MB

public class MergeTwoSortedListsSolution {
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null || l2 == null) return (l1 == null) ? l2 : l1;
        ListNode head = new ListNode(0);
        ListNode handler = head;
        head.next = handler;

        while (l1!=null && l2!=null){
            if(l1.val<=l2.val){
                handler.next = l1;
                l1 = l1.next;
            } else {
                handler.next = l2;
                l2 = l2.next;
            }
            handler = handler.next;
        }

        if(l2!=null) handler.next = l2;
        else if(l1!=null) handler.next = l1;

        return head.next;
    }

    public static void main(String[] args) {
        ListNode testCase1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode testCase2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        ListNode result = mergeTwoLists(testCase1, testCase2);
        System.out.println(result.val);
    }
}

// Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
