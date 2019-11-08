package CodingInterviews;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class _32_1_PrintTreeFromTopToBottom {
    static ArrayList<Integer> printFromTopToBottom(TreeNode root) {
        ArrayList<Integer> rst = new ArrayList<>();

        if (root == null) return rst;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            rst.add(node.val);

            if (node.left != null) queue.offer(node.left);
            if (node.right != null) queue.offer(node.right);
        }

        return rst;
    }

    public static void main(String[] args) {
    }
}
