package CodingInterviews;

// 删除链表中重复的结点
public class _18_2_DeleteDuplicatedNode {
  public ListNode deleteDuplication(ListNode pHead) {
    ListNode dummyHead = new ListNode(0);
    dummyHead.next = pHead;

    ListNode prev = dummyHead;
    ListNode last = pHead;

    while (last != null) {
      if (last.next == null || last.val != last.next.val) {
        prev = prev.next;
        last = last.next;
        continue;
      }

      while (last.next != null && last.val == last.next.val) last = last.next;
      prev.next = last.next;
      last = last.next;
    }
    return dummyHead.next;
  }
}
