package CodingInterviews;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class _32_1_PrintTreeFromTopToBottom {

    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> rst = new ArrayList();
        if (root == null) return rst;

        Queue<TreeNode> q = new LinkedList();
        q.offer(root);

        while (!q.isEmpty()) {
            TreeNode node = q.poll();
            rst.add(node.val);
            if (node.left != null) q.offer(node.left);
            if (node.right != null) q.offer(node.right);
        }
        return rst;
    }

}
