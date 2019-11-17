package CodingInterviews;

public class _54_KthNodeInBST {

    private int k;

    public TreeNode KthNode(TreeNode pHead, int k) {
        if (pHead == null || k <= 0) return null;

        this.k = k;

        return KthNodeCore(pHead);
    }

    private TreeNode KthNodeCore(TreeNode curr) {
        if (curr == null || k <= 0) return null;

        TreeNode kNode = KthNodeCore(curr.left);
        if (kNode != null) return kNode;

        if (curr != null && k == 1) {
            return curr;
        }
        k -= 1;

        return KthNodeCore(curr.right);
    }

    public static void test1() {
        _54_KthNodeInBST p = new _54_KthNodeInBST();

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

        System.out.println(p.KthNode(node8, 0) == null ? "Passed" : "Failed");
        System.out.println(p.KthNode(node8, 1) == node5 ? "Passed" : "Failed");
        System.out.println(p.KthNode(node8, 2) == node6 ? "Passed" : "Failed");
        System.out.println(p.KthNode(node8, 3) == node7 ? "Passed" : "Failed");
        System.out.println(p.KthNode(node8, 4) == node8 ? "Passed" : "Failed");
        System.out.println(p.KthNode(node8, 5) == node9 ? "Passed" : "Failed");
        System.out.println(p.KthNode(node8, 6) == node10 ? "Passed" : "Failed");
        System.out.println(p.KthNode(node8, 7) == node11 ? "Passed" : "Failed");
        System.out.println(p.KthNode(node8, 8) == null ? "Passed" : "Failed");
    }

    public static void test2() {
        _54_KthNodeInBST p = new _54_KthNodeInBST();

        TreeNode node5 = new TreeNode(5);
        TreeNode node4 = new TreeNode(4);
        TreeNode node3 = new TreeNode(3);
        TreeNode node2 = new TreeNode(2);
        TreeNode node1 = new TreeNode(1);

        node5.left = node4;
        node4.left = node3;
        node3.left = node2;
        node2.left = node1;

        System.out.println(p.KthNode(node5, 0) == null ? "Passed" : "Failed");
        System.out.println(p.KthNode(node5, 1) == node1 ? "Passed" : "Failed");
        System.out.println(p.KthNode(node5, 2) == node2 ? "Passed" : "Failed");
        System.out.println(p.KthNode(node5, 3) == node3 ? "Passed" : "Failed");
        System.out.println(p.KthNode(node5, 4) == node4 ? "Passed" : "Failed");
        System.out.println(p.KthNode(node5, 5) == node5 ? "Passed" : "Failed");
        System.out.println(p.KthNode(node5, 6) == null ? "Passed" : "Failed");
    }

    public static void test3() {
        _54_KthNodeInBST p = new _54_KthNodeInBST();

        TreeNode node5 = new TreeNode(5);
        TreeNode node4 = new TreeNode(4);
        TreeNode node3 = new TreeNode(3);
        TreeNode node2 = new TreeNode(2);
        TreeNode node1 = new TreeNode(1);

        node1.right = node2;
        node2.right = node3;
        node3.right = node4;
        node4.right = node5;

        System.out.println(p.KthNode(node1, 0) == null ? "Passed" : "Failed");
        System.out.println(p.KthNode(node1, 1) == node1 ? "Passed" : "Failed");
        System.out.println(p.KthNode(node1, 2) == node2 ? "Passed" : "Failed");
        System.out.println(p.KthNode(node1, 3) == node3 ? "Passed" : "Failed");
        System.out.println(p.KthNode(node1, 4) == node4 ? "Passed" : "Failed");
        System.out.println(p.KthNode(node1, 5) == node5 ? "Passed" : "Failed");
        System.out.println(p.KthNode(node1, 6) == null ? "Passed" : "Failed");
    }

    public static void test4() {
        _54_KthNodeInBST p = new _54_KthNodeInBST();

        TreeNode node1 = new TreeNode(1);

        System.out.println(p.KthNode(node1, 0) == null ? "Passed" : "Failed");
        System.out.println(p.KthNode(node1, 1) == node1 ? "Passed" : "Failed");
        System.out.println(p.KthNode(node1, 2) == null ? "Passed" : "Failed");
    }

    public static void test5() {
        _54_KthNodeInBST p = new _54_KthNodeInBST();

        System.out.println(p.KthNode(null, 0) == null ? "Passed" : "Failed");
        System.out.println(p.KthNode(null, 1) == null ? "Passed" : "Failed");
    }

    public static void main(String[] args) {

        test1();
        System.out.println();

        test2();
        System.out.println();

        test3();
        System.out.println();

        test4();
        System.out.println();

        test5();
    }
}
