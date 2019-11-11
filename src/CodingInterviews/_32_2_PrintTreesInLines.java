package CodingInterviews;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class _32_2_PrintTreesInLines {

    static ArrayList<ArrayList<Integer>> printInLines(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> rst = new ArrayList<>();

        if (pRoot == null) return rst;

        Queue<TreeNode> queue = new LinkedList<>();
        rst.add(new ArrayList<>());
        queue.offer(pRoot);
        int nextLevel = 0;
        int toBePrinted = 1;
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            rst.get(rst.size() - 1).add(node.val);
            toBePrinted--;

            if (node.left != null) {
                queue.offer(node.left);
                nextLevel++;
            }
            if (node.right != null) {
                queue.offer(node.right);
                nextLevel++;
            }

            if (toBePrinted == 0 && nextLevel != 0) {
                rst.add(new ArrayList<>());
                toBePrinted = nextLevel;
                nextLevel = 0;
            }
        }

        return rst;
    }

    public static void main(String[] args) {
    }
}
