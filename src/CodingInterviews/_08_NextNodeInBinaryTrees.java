package CodingInterviews;

public class _08_NextNodeInBinaryTrees {

    public TreeLinkNode GetNext(TreeLinkNode pNode) {
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

}
