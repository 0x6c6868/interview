package CodingInterviews;

import CodingInterviews.util.CharTreeNode;

public class _08_NextNodeInBinaryTrees {

    static CharTreeNode findNextNode(CharTreeNode node) {

        if (node == null) return null;

        if (node.right != null) {
            CharTreeNode rstNode = node.right;

            while (rstNode.left != null)
                rstNode = rstNode.left;

            return rstNode;
        } else if (node.parent != null) {
            CharTreeNode parent = node.parent;

            while (parent != null && parent.right == node) {
                node = node.parent;
                parent = node.parent;
            }

            return parent;
        }

        return null;
    }

    public static void main(String[] args) {

        CharTreeNode a = new CharTreeNode('a');
        CharTreeNode b = new CharTreeNode('b');
        CharTreeNode c = new CharTreeNode('c');
        CharTreeNode d = new CharTreeNode('d');
        CharTreeNode e = new CharTreeNode('e');
        CharTreeNode f = new CharTreeNode('f');
        CharTreeNode g = new CharTreeNode('g');
        CharTreeNode h = new CharTreeNode('h');
        CharTreeNode i = new CharTreeNode('i');

        a.left = b;
        a.right = c;
        b.parent = a;
        c.parent = a;

        b.left = d;
        b.right = e;
        d.parent = b;
        e.parent = b;

        e.left = h;
        e.right = i;
        h.parent = e;
        i.parent = e;

        c.left = f;
        c.right = g;
        f.parent = c;
        f.parent = c;

        CharTreeNode nextNode = findNextNode(a);
        System.out.println(nextNode.val);

    }
}
