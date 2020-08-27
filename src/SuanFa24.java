import java.util.List;
import javax.swing.text.html.HTMLDocument.HTMLReader;

/**
 * SuanFa55
 *
 * @Author bowen.cui
 * @Date 2020/5/8 21:47
 **/
public class SuanFa24 {

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);

        node3.next = node4;
        node2.next = node3;
        node1.next = node2;

        System.out.println(swapPairs(node1));
    }

    public static ListNode swapPairs(ListNode head) {

/*        ListNode temp = new ListNode(0);
        temp.next = head;

        ListNode new1 = temp.next;
        ListNode newTemp = null;

        boolean first = true;
        while (new1 != null) {

            newTemp = new1.next;
            if (newTemp == null) {
                break;
            }

            new1.next = newTemp.next;
            newTemp.next = new1;
            new1 = newTemp;
            new1 = new1.next;
            if (first) {
                first = false;
                temp.next = newTemp;
            }
        }

        return temp.next;*/

        ListNode temp = new ListNode(0);
        temp.next = head;

        ListNode tem;
        ListNode pre = temp;
        ListNode now = temp.next;
        ListNode next;
        while (now != null && now.next != null) {
            tem = now;
            next = now.next;
            tem.next = next.next;
            next.next = tem;
            pre.next = next;

            now = tem.next;
            pre = tem;
        }
        return temp.next;
    }

}
