package CodingInterviews;

public class _18_2_DeleteDuplicatedNode {

  public ListNode deleteDuplication(ListNode pHead) {
    ListNode dummyHead = new ListNode(0);
    dummyHead.next = pHead;

    ListNode prev = dummyHead;
    ListNode last = pHead;

    while (last != null) {
      if (last.next != null && last.val == last.next.val) {
        while (last.next != null && last.val == last.next.val) last = last.next;
        prev.next = last.next;
        last = last.next;
      } else {
        prev = prev.next;
        last = last.next;
      }
    }
    return dummyHead.next;
  }
}
