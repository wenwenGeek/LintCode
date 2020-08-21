import java.util.PriorityQueue;

/**
 * SuanFa55
 *
 * @Author bowen.cui
 * @Date 2020/5/8 21:47
 **/
public class SuanFa23 {


    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>((integer, t1) -> t1 - integer);

        for (ListNode list : lists) {
            while (list != null) {
                priorityQueue.add(list.val);
                list = list.next;
            }
        }
        ListNode returnNode = null;
        ListNode next = new ListNode();
        boolean isBegin = true;
        while (true) {
            Integer poll = priorityQueue.poll();
            if (poll == null) {
                break;
            }
            returnNode = new ListNode(poll);
            if(isBegin){
                returnNode.next = null;
                isBegin =false;
            }else{
                returnNode.next=next;
            }
            next = returnNode;
        }
        return returnNode;
    }

}
