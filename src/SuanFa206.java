/**
 * SuanFa55
 *
 * @Author bowen.cui
 * @Date 2020/5/8 21:47
 **/
public class SuanFa206 {

    public ListNode reverseList(ListNode head) {

        ListNode newNode = null;

        while (head !=null){

            ListNode next = head.next;

            head.next = newNode;

            newNode = head;

            head = next;

        }
        return newNode;

    }

}
