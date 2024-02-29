package solved.medium;

import java.math.BigInteger;

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        StringBuilder l1NumString = new StringBuilder();
        StringBuilder l2NumString = new StringBuilder();
        while (l1 != null) {
            l1NumString.append(l1.val);
            l1 = l1.next;
        }
        while (l2 != null) {
            l2NumString.append(l2.val);
            l2 = l2.next;
        }
        l1NumString.reverse();
        l2NumString.reverse();
        BigInteger sum = new BigInteger(String.valueOf(l1NumString)).add(new BigInteger(String.valueOf(l2NumString)));
        String[] split = sum.toString().split("");
        ListNode listNode = new ListNode();
        ListNode head = listNode;
        for (int i = split.length - 1; i >= 0; i--) {
            listNode.val = Integer.parseInt(split[i]);
            if (i != 0) {
                listNode.next = new ListNode();
                listNode = listNode.next;
            }
        }

        return head;
    }

}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }


}
