import com.sun.media.jfxmedia.events.NewFrameEvent;
import com.sun.org.apache.bcel.internal.generic.NEW;
import java.nio.file.FileStore;
import java.util.ArrayList;
import java.util.List;

/**
 * SuanFa55
 *
 * @Author bowen.cui
 * @Date 2020/5/8 21:47
 **/
public class SuanFa19 {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = new ListNode(0);
        temp.next = head;
        ListNode first = temp;
        ListNode second = temp;

        while (n >= 0 && second !=null) {
            n--;
            second = second.next;
        }

        while (second != null) {
            first = first.next;
            second = second.next;
        }
        first.next = first.next.next;
        return temp.next;
    }

}
