package CodingInterviews;

import java.util.ArrayList;
import java.util.List;

public class _68_CommonParentInTree {

    public MultipleTreeNode GetLastCommonParent(MultipleTreeNode pRoot, MultipleTreeNode pNode1, MultipleTreeNode pNode2) {
        if (pRoot == null || pNode1 == null || pNode2 == null) return null;

        List<MultipleTreeNode> leftPath = new ArrayList<>();
        leftPath.add(pRoot);
        if (!GetNodePath(pRoot, pNode1, leftPath)) {
            leftPath.remove(0);
        }

        List<MultipleTreeNode> rightPath = new ArrayList<>();
        rightPath.add(pRoot);
        if (!GetNodePath(pRoot, pNode2, rightPath)) {
            rightPath.remove(0);
        }

        if (leftPath.size() != 0 && rightPath.size() != 0) {

            int min = leftPath.size() > rightPath.size() ? rightPath.size() : leftPath.size();

            int i = 0;
            for (; i < min; i++) {
                if (leftPath.get(i) != rightPath.get(i)) {
                    return leftPath.get(i - 1);
                }
            }

            return leftPath.get(min - 2);
        }
        return null;
    }

    private boolean GetNodePath(MultipleTreeNode currNode, MultipleTreeNode pNode, List<MultipleTreeNode> path) {
        if (currNode == null) return false;

        if (pNode == currNode) return true;

        if (currNode.nodeList != null) {
            for (MultipleTreeNode node : currNode.nodeList) {
                path.add(node);
                if (GetNodePath(node, pNode, path)) {
                    return true;
                }
                path.remove(path.size() - 1);
            }
        }
        return false;
    }

    public static void test1() {
        MultipleTreeNode node1 = new MultipleTreeNode(1);

        MultipleTreeNode node2 = new MultipleTreeNode(2);
        MultipleTreeNode node3 = new MultipleTreeNode(3);

        MultipleTreeNode node4 = new MultipleTreeNode(4);
        MultipleTreeNode node5 = new MultipleTreeNode(5);

        MultipleTreeNode node6 = new MultipleTreeNode(6);
        MultipleTreeNode node7 = new MultipleTreeNode(7);

        MultipleTreeNode node8 = new MultipleTreeNode(8);
        MultipleTreeNode node9 = new MultipleTreeNode(9);
        MultipleTreeNode node10 = new MultipleTreeNode(10);

        node1.nodeList = new ArrayList() {{
            add(node2);
            add(node3);
        }};

        node2.nodeList = new ArrayList() {{
            add(node4);
            add(node5);
        }};

        node4.nodeList = new ArrayList() {{
            add(node6);
            add(node7);
        }};

        node5.nodeList = new ArrayList() {{
            add(node8);
            add(node9);
            add(node10);
        }};

        _68_CommonParentInTree p = new _68_CommonParentInTree();
        System.out.println(p.GetLastCommonParent(node1, node6, node8) == node2);
    }

    public static void test2() {
        MultipleTreeNode node1 = new MultipleTreeNode(1);
        MultipleTreeNode node2 = new MultipleTreeNode(2);
        MultipleTreeNode node3 = new MultipleTreeNode(3);
        MultipleTreeNode node4 = new MultipleTreeNode(4);
        MultipleTreeNode node5 = new MultipleTreeNode(5);

        node1.nodeList = new ArrayList() {{
            add(node2);
        }};

        node2.nodeList = new ArrayList() {{
            add(node3);
        }};

        node3.nodeList = new ArrayList() {{
            add(node4);
        }};

        node4.nodeList = new ArrayList() {{
            add(node5);
        }};

        _68_CommonParentInTree p = new _68_CommonParentInTree();
        System.out.println(p.GetLastCommonParent(node1, node5, node4) == node3);
    }

    public static void test3() {
        MultipleTreeNode node1 = new MultipleTreeNode(1);
        MultipleTreeNode node2 = new MultipleTreeNode(2);
        MultipleTreeNode node3 = new MultipleTreeNode(3);
        MultipleTreeNode node4 = new MultipleTreeNode(4);
        MultipleTreeNode node5 = new MultipleTreeNode(5);

        node1.nodeList = new ArrayList() {{
            add(node2);
        }};

        node2.nodeList = new ArrayList() {{
            add(node3);
        }};

        node3.nodeList = new ArrayList() {{
            add(node4);
        }};

        node4.nodeList = new ArrayList() {{
            add(node5);
        }};

        MultipleTreeNode node6 = new MultipleTreeNode(6);

        _68_CommonParentInTree p = new _68_CommonParentInTree();
        System.out.println(p.GetLastCommonParent(node1, node5, node6) == null);
    }

    public static void test4() {
        _68_CommonParentInTree p = new _68_CommonParentInTree();
        System.out.println(p.GetLastCommonParent(null, null, null) == null);
    }

    public static void main(String[] args) {
        test1();
        test2();
        test3();
        test4();
    }
}
