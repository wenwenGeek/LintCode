import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode next; ListNode(int x) { val = x; } }
 */
public class Solution {

    public static void main(String[] args) {

    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }

        List<Integer> list1 = new ArrayList<>();
        while (l1 != null) {
            list1.add(l1.val);
            l1 = l1.next;
        }
        while (l2 != null) {
            list1.add(l2.val);
            l2 = l2.next;
        }


        Collections.sort(list1);

        ListNode returnNode = new ListNode(list1.get(list1.size() - 1));
        for (int i = list1.size() - 2; i >= 0; i--) {
            ListNode newNode = new ListNode(list1.get(i));
            newNode.next = returnNode;
            returnNode = newNode;
        }
        return returnNode;
    }
}

class ListNode {

    int val;
    ListNode next;
    ListNode() {}
    ListNode(int x) {
        val = x;
    }
}