package CodingInterviews;

public class _08_NextNodeInBinaryTrees {

    public TreeLinkNode GetNext(TreeLinkNode pNode) {
        if (pNode == null) return null;

        if (pNode.right != null) {
            TreeLinkNode curr = pNode.right;
            while (curr.left != null) curr = curr.left;
            return curr;
        }

        TreeLinkNode parentNode = pNode.next;
        while (parentNode != null && parentNode.right == pNode) {
            pNode = parentNode;
            parentNode = pNode.next;
        }
        return parentNode;
    }

}
