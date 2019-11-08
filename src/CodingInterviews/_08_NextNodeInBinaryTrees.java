package CodingInterviews;

public class _08_NextNodeInBinaryTrees {

    static TreeLinkNode getNext(TreeLinkNode pNode) {

        if (pNode == null) return null;

        if (pNode.right != null) {
            TreeLinkNode rstNode = pNode.right;

            while (rstNode.left != null)
                rstNode = rstNode.left;

            return rstNode;
        } else if (pNode.next != null) {
            TreeLinkNode parent = pNode.next;

            while (parent != null && parent.right == pNode) {
                pNode = pNode.next;
                parent = pNode.next;
            }

            return parent;
        }

        return null;
    }

    public static void main(String[] args) {

        TreeLinkNode a = new TreeLinkNode('a');
        TreeLinkNode b = new TreeLinkNode('b');
        TreeLinkNode c = new TreeLinkNode('c');
        TreeLinkNode d = new TreeLinkNode('d');
        TreeLinkNode e = new TreeLinkNode('e');
        TreeLinkNode f = new TreeLinkNode('f');
        TreeLinkNode g = new TreeLinkNode('g');
        TreeLinkNode h = new TreeLinkNode('h');
        TreeLinkNode i = new TreeLinkNode('i');

        a.left = b;
        a.right = c;
        b.next = a;
        c.next = a;

        b.left = d;
        b.right = e;
        d.next = b;
        e.next = b;

        e.left = h;
        e.right = i;
        h.next = e;
        i.next = e;

        c.left = f;
        c.right = g;
        f.next = c;
        f.next = c;

        TreeLinkNode nextNode = getNext(a);
        System.out.println(nextNode.val);

    }
}
