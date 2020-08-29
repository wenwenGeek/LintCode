import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * SuanFa55
 *
 * @Author bowen.cui
 * @Date 2020/5/8 21:47
 **/
public class SuanFa142 {

    public ListNode detectCycle(ListNode head) {
        ListNode temp = head;

        Set<ListNode> listSet = new HashSet<>();
        while(true){
            if(head == null) return null;

            if(listSet.contains(head))return head;

            listSet.add(head);
            head = head.next;

        }

    }

}
