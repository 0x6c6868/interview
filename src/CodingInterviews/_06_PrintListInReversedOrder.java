package CodingInterviews;

import java.util.ArrayList;

// 从尾到头打印链表
public class _06_PrintListInReversedOrder {

  private final ArrayList<Integer> rst = new ArrayList<>();

  public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
    if (listNode == null) return rst;

    if (listNode.next != null) printListFromTailToHead(listNode.next);
    rst.add(listNode.val);

    return rst;
  }
}
