import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * SuanFa55
 *
 * @Author bowen.cui
 * @Date 2020/5/8 21:47
 **/
public class SuanFa138 {

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

    }

    public Node copyRandomList(Node head) {

        Node temHead = head;

        Map<Node,Node> newHead = new HashMap<>();
        Node newNode = null;
        Node temp = newNode;
        while(head!=null){
            Node a= new Node(head.val);
            if(newNode == null){
                newNode = a;
                temp = newNode;
            }else{
                temp.next = a;
                temp = a;
            }
            newHead.put(head,a);
            head = head.next;
        }
        Node tempaa= newNode;
        while (temHead!=null){
            tempaa.random = newHead.get(temHead.random);
            tempaa = tempaa.next;
            temHead = temHead.next;
        }

        return newNode;
    }

    class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }

}
