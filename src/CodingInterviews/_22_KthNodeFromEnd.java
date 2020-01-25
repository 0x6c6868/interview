package CodingInterviews;

// 链表中倒数第k个结点
public class _22_KthNodeFromEnd {

  public ListNode FindKthToTail(ListNode head, int k) {
    ListNode first = head, second = head;

    int i = 0;
    for (; first != null; i++) {
      if (i >= k) second = second.next;
      first = first.next;
    }
    return i < k ? null : second;
  }
}
