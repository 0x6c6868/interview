package CodingInterviews;

import java.util.ArrayList;
import java.util.Stack;

public class _32_3_PrintTreesInZigzag {

    public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> rst = new ArrayList();
        if (pRoot == null) return rst;

        Stack<TreeNode> s1 = new Stack<>();
        Stack<TreeNode> s2 = new Stack<>();

        s1.push(pRoot);
        while (!s1.isEmpty() || !s2.isEmpty()) {
            ArrayList<Integer> subRst = new ArrayList();
            while (!s1.isEmpty()) {
                TreeNode node = s1.pop();
                if (node.left != null) s2.push(node.left);
                if (node.right != null) s2.push(node.right);
                subRst.add(node.val);
            }
            if (subRst.size() > 0) rst.add(subRst);

            subRst = new ArrayList();
            while (!s2.isEmpty()) {
                TreeNode node = s2.pop();
                if (node.right != null) s1.push(node.right);
                if (node.left != null) s1.push(node.left);
                subRst.add(node.val);
            }
            if (subRst.size() > 0) rst.add(subRst);
        }
        return rst;
    }

}
