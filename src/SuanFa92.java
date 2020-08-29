import javax.naming.NamingException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * SuanFa55
 *
 * @Author bowen.cui
 * @Date 2020/5/8 21:47
 **/
public class SuanFa92 {

    public static void main(String[] args) {
        ListNode node5 = new ListNode(3);
        ListNode node4 = new ListNode(2);
        ListNode node3 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node1 = new ListNode(1);
        node4.next=node5;
        node3.next=node4;
        node2.next=node3;
        node1.next=node2;

        System.out.println(reverseBetween(node3,3,3));
    }

    public static ListNode reverseBetween(ListNode head, int m, int n) {
        Stack<Integer> returnStack = new Stack<>();
        Queue<Integer> newStack = new LinkedList<>();
        ListNode end = null;
        int index = 1;
        while (true){
            if(m==index){
                while (n>=index++){
                    newStack.add(head.val);
                    head = head.next;
                }
            }else if(index<=m){
                returnStack.add(head.val);
                head = head.next;
            }else if(index > n){
                end = head;
                break;
            }
            index++;

        }
        ListNode node = null;
        while (!newStack.isEmpty()){
            node = new ListNode(newStack.poll());
            node.next = end;
            end = node;
        }

        while (!returnStack.isEmpty()){
            node = new ListNode(returnStack.pop());
            node.next = end;
            end = node;
        }
        return end;

/*        int index = 1;
        while(true){
            ListNode temp = head;
            ListNode begin = head.next;
            if(m == ++index){
                ListNode newNode = null;
                while(true){
                    ListNode newNext = begin.next;
                    begin.next = newNode;
                    newNode = begin;
                    begin = newNext;
                    index ++;
                    if(index ==n){
                        newNode.next = newNext;
                    }
                }
                temp.next = newNode;
                break;
            }
        }
        return head;*/

    }

}
