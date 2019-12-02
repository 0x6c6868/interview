package CodingInterviews;

import java.util.ArrayList;

public class _06_PrintListInReversedOrder {

    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> rst = new ArrayList<Integer>();
        if (listNode == null) return rst;

        printCore(listNode, rst);

        return rst;

    }

    private void printCore(ListNode listNode, ArrayList<Integer> rst) {
        if (listNode.next != null)
            printCore(listNode.next, rst);
        rst.add(listNode.val);
    }

}
