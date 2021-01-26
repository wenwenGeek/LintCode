/**
 * 翻转链表
 *
 * @Author bowen.cui
 * @Date 2020/12/6 19:01
 **/
public class 翻转链表 {
    //  1 4  3  2  4   5  6

    // 1 -> 2 -> 3

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        ListNode node6 = new ListNode(6);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = null;

        ListNode listNode = reverseBetween(node1, 2, 4);
        System.out.println(listNode);
    }

   /* public static ListNode reverseBetween(ListNode head, int m, int n) {
// base case
        if (m == 1) {
            return digui(head, n);
        }
        // 前进到反转的起点触发 base case
        head.next = reverseBetween(head.next, m - 1, n - 1);
        return head;
    }

    static ListNode endNode = null; // 后驱节点

    public static ListNode digui(ListNode listNode, int n){
        if(n ==1){
            endNode = listNode.next;
            return listNode;
        }

        ListNode lastNode = digui(listNode.next,n-1);
        listNode.next.next=listNode;
        listNode.next = endNode;
        return lastNode;
    }
*/


   private static ListNode endNode = null;

    public static ListNode reverseBetween(ListNode head, int m, int n) {


        if(m==1){
            return digui(head, n);
        }

        head.next = reverseBetween(head.next, m-1, n-1);
        return head;

    }

    public static ListNode digui(ListNode listNode,int n){

        if(n==1){
            endNode = listNode.next;
            return listNode;
        }

        ListNode lastNode = digui(listNode.next, n-1);

        listNode.next.next = listNode;
        listNode.next = endNode;
        return lastNode;

    }











}