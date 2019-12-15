package CodingInterviews;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class _32_2_PrintTreesInLines {

  public ArrayList<ArrayList<Integer>> printInLines(TreeNode pRoot) {
    if (pRoot == null) return null;

    ArrayList<ArrayList<Integer>> rst = new ArrayList();

    Queue<TreeNode> q = new LinkedList();
    q.offer(pRoot);
    int toBePrinted = 1;
    int nextLevel = 0;

    ArrayList<Integer> subRst = new ArrayList();
    while (!q.isEmpty()) {
      TreeNode node = q.poll();
      subRst.add(node.val);

      if (node.left != null) {
        q.offer(node.left);
        nextLevel++;
      }

      if (node.right != null) {
        q.offer(node.right);
        nextLevel++;
      }

      if (--toBePrinted == 0) {
        rst.add(subRst);
        subRst = new ArrayList();
        toBePrinted = nextLevel;
        nextLevel = 0;
      }
    }
    return rst;
  }

  public static void test1() {
    _32_2_PrintTreesInLines p = new _32_2_PrintTreesInLines();
    TreeNode node8 = new TreeNode(8);

    TreeNode node6 = new TreeNode(6);
    TreeNode node10 = new TreeNode(10);

    TreeNode node5 = new TreeNode(5);
    TreeNode node7 = new TreeNode(7);

    TreeNode node9 = new TreeNode(9);
    TreeNode node11 = new TreeNode(11);

    node8.left = node6;
    node8.right = node10;

    node6.left = node5;
    node6.right = node7;

    node10.left = node9;
    node10.right = node11;

    try {
      ArrayList<ArrayList<Integer>> rst = p.printInLines(node8);
      boolean flag =
          rst.get(0).get(0) == 8
              && rst.get(1).get(0) == 6
              && rst.get(1).get(1) == 10
              && rst.get(2).get(0) == 5
              && rst.get(2).get(1) == 7
              && rst.get(2).get(2) == 9
              && rst.get(2).get(3) == 11;
      System.out.println(flag);
    } catch (Throwable e) {
      System.out.println(false);
    }
  }

  public static void test2() {
    _32_2_PrintTreesInLines p = new _32_2_PrintTreesInLines();
    TreeNode node5 = new TreeNode(5);
    TreeNode node4 = new TreeNode(4);
    TreeNode node3 = new TreeNode(3);
    TreeNode node2 = new TreeNode(2);

    node5.left = node4;
    node4.left = node3;
    node3.left = node2;

    try {
      ArrayList<ArrayList<Integer>> rst = p.printInLines(node5);
      boolean flag =
          rst.get(0).get(0) == 5
              && rst.get(1).get(0) == 4
              && rst.get(2).get(0) == 3
              && rst.get(3).get(0) == 2;
      System.out.println(flag);
    } catch (Throwable e) {
      System.out.println(false);
    }
  }

  public static void test3() {
    _32_2_PrintTreesInLines p = new _32_2_PrintTreesInLines();
    TreeNode node5 = new TreeNode(5);
    TreeNode node4 = new TreeNode(4);
    TreeNode node3 = new TreeNode(3);
    TreeNode node2 = new TreeNode(2);

    node5.right = node4;
    node4.right = node3;
    node3.right = node2;

    try {
      ArrayList<ArrayList<Integer>> rst = p.printInLines(node5);
      boolean flag =
          rst.get(0).get(0) == 5
              && rst.get(1).get(0) == 4
              && rst.get(2).get(0) == 3
              && rst.get(3).get(0) == 2;
      System.out.println(flag);
    } catch (Throwable e) {
      System.out.println(false);
    }
  }

  public static void test4() {
    _32_2_PrintTreesInLines p = new _32_2_PrintTreesInLines();
    TreeNode node5 = new TreeNode(5);
    TreeNode node4 = new TreeNode(4);
    TreeNode node3 = new TreeNode(3);
    TreeNode node2 = new TreeNode(2);

    node5.right = node4;
    node4.right = node3;
    node3.right = node2;

    try {
      ArrayList<ArrayList<Integer>> rst = p.printInLines(node5);
      boolean flag =
          rst.get(0).get(0) == 5
              && rst.get(1).get(0) == 4
              && rst.get(2).get(0) == 3
              && rst.get(3).get(0) == 2;
      System.out.println(flag);
    } catch (Throwable e) {
      System.out.println(false);
    }
  }

  public static void test5() {
    _32_2_PrintTreesInLines p = new _32_2_PrintTreesInLines();

    try {
      ArrayList<ArrayList<Integer>> rst = p.printInLines(null);
      System.out.println(rst == null);
    } catch (Throwable e) {
      System.out.println(false);
    }
  }

  public static void test6() {
    _32_2_PrintTreesInLines p = new _32_2_PrintTreesInLines();
    TreeNode node100 = new TreeNode(100);
    TreeNode node50 = new TreeNode(50);
    TreeNode node150 = new TreeNode(150);

    node100.left = node50;
    node50.right = node150;

    try {
      ArrayList<ArrayList<Integer>> rst = p.printInLines(node100);

      boolean flag =
          rst.get(0).get(0) == 100 && rst.get(1).get(0) == 50 && rst.get(2).get(0) == 150;
      System.out.println(flag);
    } catch (Throwable e) {
      System.out.println(false);
    }
  }

  public static void main(String[] args) {
    test1();
    test2();
    test3();
    test4();
    test5();
    test6();
  }
}
