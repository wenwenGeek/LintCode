/**
 * SuanFa55
 *
 * @Author bowen.cui
 * @Date 2020/5/8 21:47
 **/
public class SuanFa141 {

    public boolean hasCycle(ListNode head) {
        if(head == null) return false;

        ListNode node2 = head;

        while(true){
            head = head.next;
            if(head == null) return false;
            head = head.next;
            if(head == null) return false;

            node2 = node2.next;
            if(head == node2) return true;
        }

    }

}
