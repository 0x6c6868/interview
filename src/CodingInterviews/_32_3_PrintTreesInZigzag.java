package CodingInterviews;

import java.util.ArrayList;
import java.util.Stack;

public class _32_3_PrintTreesInZigzag {

    static ArrayList<ArrayList<Integer>> print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> rst = new ArrayList<>();

        if (pRoot == null) return rst;

        Stack<TreeNode> stack1 = new Stack<>();
        Stack<TreeNode> stack2 = new Stack<>();
        stack1.push(pRoot);
        boolean lvl = true;
        rst.add(new ArrayList());
        while (!stack1.isEmpty() || !stack2.isEmpty()) {
            TreeNode node = lvl ? stack1.pop() : stack2.pop();

            rst.get(rst.size() - 1).add(node.val);

            if (lvl) {
                if (node.left != null) stack2.push(node.left);
                if (node.right != null) stack2.push(node.right);
            } else {
                if (node.right != null) stack1.push(node.right);
                if (node.left != null) stack1.push(node.left);
            }

            if ((lvl && stack1.isEmpty() && !stack2.isEmpty()) ||
                    (!lvl && !stack1.isEmpty() && stack2.isEmpty())) {
                rst.add(new ArrayList());
                lvl = !lvl;
            }
        }

        return rst;
    }

}
