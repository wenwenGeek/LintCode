import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * SuanFa55
 *
 * @Author bowen.cui
 * @Date 2020/5/8 21:47
 **/
public class SuanFa86 {

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(4);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(2);
        ListNode node5 = new ListNode(5);
        ListNode node6 = new ListNode(2);

        node5.next = node6;
        node4.next = node5;
        node3.next = node4;
        node2.next = node3;
        node1.next = node2;

        System.out.println(partition(node1, 3));
    }

    public static ListNode partition(ListNode head, int x) {

        ListNode temp = null;
        ListNode xiaoList = null;
        ListNode datemp = null;
        ListNode daList = null;
        while (head != null) {

            if (head.val < x) {
                if (xiaoList == null) {
                    xiaoList = new ListNode(head.val);
                    temp = xiaoList;
                } else {
                    ListNode newNode = new ListNode(head.val);
                    temp.next = newNode;
                    temp = newNode;
                }
            } else {
                if (daList == null) {
                    daList = new ListNode(head.val);
                    datemp = daList;
                } else {
                    ListNode newNode = new ListNode(head.val);
                    datemp.next = newNode;
                    datemp = newNode;
                }
            }
            head = head.next;
        }
        if (temp != null) {
            temp.next = daList;

        } else {
            return daList;
        }
        return xiaoList;

    }

}
