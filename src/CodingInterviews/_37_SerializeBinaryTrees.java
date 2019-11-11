package CodingInterviews;

public class _37_SerializeBinaryTrees {

    int index = 0;

    String Serialize(TreeNode root) {
        if (root == null) return "$";
        return root.val + "," + Serialize(root.left) + "," + Serialize(root.right);
    }

    TreeNode Deserialize(String str) {
        if (str == null || str.length() == 0) return null;
        String[] strList = str.split(",");
        return deserializeCore(strList);
    }

    TreeNode deserializeCore(String[] strList) {
        if (index >= strList.length) return null;

        String val = strList[index];
        if (val.equals("$")) return null;

        int valInt = Integer.parseInt(val);
        TreeNode node = new TreeNode(valInt);

        index += 1;
        TreeNode leftNode = deserializeCore(strList);

        index += 1;
        TreeNode rightNode = deserializeCore(strList);

        node.left = leftNode;
        node.right = rightNode;

        return node;
    }

}
