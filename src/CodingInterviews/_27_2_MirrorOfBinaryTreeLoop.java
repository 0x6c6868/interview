package CodingInterviews;

import java.util.ArrayDeque;
import java.util.Queue;

public class _27_2_MirrorOfBinaryTreeLoop {

    public void mirror(TreeNode root) {
        if (root == null) return;

        Queue<TreeNode> q = new ArrayDeque();
        q.offer(root);

        while (!q.isEmpty()) {
            TreeNode currNode = q.poll();

            TreeNode tmp = currNode.left;
            currNode.left = currNode.right;
            currNode.right = tmp;

            if (currNode.left != null)
                q.offer(currNode.left);
            if (currNode.right != null)
                q.offer(currNode.right);
        }
    }

}
