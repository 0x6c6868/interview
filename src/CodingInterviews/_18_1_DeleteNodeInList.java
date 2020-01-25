package CodingInterviews;

// leetcode 237
public class _18_1_DeleteNodeInList {

  public void deleteNode(ListNode node) {
    node.val = node.next.val;
    node.next = node.next.next;
  }
}
