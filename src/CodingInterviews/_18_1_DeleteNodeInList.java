package CodingInterviews;

public class _18_1_DeleteNodeInList {

  public ListNode deleteNode(ListNode head, ListNode node) {
    if (head == null || node == null) return head;

    // 删除的是头节点
    if (head == node) return head.next;

    // 删除的是尾部节点
    if (node.next == null) {
      ListNode prev = head;
      while (prev.next != null && prev.next != node) prev = prev.next;

      // 链表中找不到需要删除的节点
      if (prev.next != node) return head;

      prev.next = node.next;
    } else {
      // 删除的是中间节点
      node.val = node.next.val;
      node.next = node.next.next;
    }
    return head;
  }

  private static void test1() {
    ListNode node1 = new ListNode(1);
    ListNode node2 = new ListNode(2);
    ListNode node3 = new ListNode(3);
    ListNode node4 = new ListNode(4);
    ListNode node5 = new ListNode(5);

    node1.next = node2;
    node2.next = node3;
    node3.next = node4;
    node4.next = node5;

    _18_1_DeleteNodeInList p = new _18_1_DeleteNodeInList();

    ListNode dummy = p.deleteNode(node1, node1);
    boolean flag =
        dummy.val == node2.val
            && dummy.next.val == node3.val
            && dummy.next.next.val == node4.val
            && dummy.next.next.next.val == node5.val
            && dummy.next.next.next.next == null;
    System.out.println(flag);
  }

  private static void test2() {
    ListNode node1 = new ListNode(1);
    ListNode node2 = new ListNode(2);
    ListNode node3 = new ListNode(3);
    ListNode node4 = new ListNode(4);
    ListNode node5 = new ListNode(5);

    node1.next = node2;
    node2.next = node3;
    node3.next = node4;
    node4.next = node5;

    _18_1_DeleteNodeInList p = new _18_1_DeleteNodeInList();

    ListNode dummy = p.deleteNode(node1, node5);
    boolean flag =
        dummy.val == node1.val
            && dummy.next.val == node2.val
            && dummy.next.next.val == node3.val
            && dummy.next.next.next.val == node4.val
            && dummy.next.next.next.next == null;
    System.out.println(flag);
  }

  private static void test3() {
    ListNode node1 = new ListNode(1);
    ListNode node2 = new ListNode(2);
    ListNode node3 = new ListNode(3);
    ListNode node4 = new ListNode(4);
    ListNode node5 = new ListNode(5);

    node1.next = node2;
    node2.next = node3;
    node3.next = node4;
    node4.next = node5;

    _18_1_DeleteNodeInList p = new _18_1_DeleteNodeInList();

    ListNode dummy = p.deleteNode(node1, node2);
    boolean flag =
        dummy.val == node1.val
            && dummy.next.val == node3.val
            && dummy.next.next.val == node4.val
            && dummy.next.next.next.val == node5.val
            && dummy.next.next.next.next == null;
    System.out.println(flag);
  }

  private static void test4() {
    _18_1_DeleteNodeInList p = new _18_1_DeleteNodeInList();

    ListNode dummy = p.deleteNode(null, null);
    System.out.println(dummy == null);
  }

  public static void main(String[] args) {
    test1();
    test2();
    test3();
    test4();
  }
}
