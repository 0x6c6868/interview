package CodingInterviews;

public class _37_SerializeBinaryTrees {

  private int index = -1;

  String Serialize(TreeNode root) {
    if (root == null) return "$";
    return root.val + "," + Serialize(root.left) + "," + Serialize(root.right);
  }

  TreeNode Deserialize(String str) {
    if (str == null) return null;
    return DeserializeCore(str.split(","));
  }

  private TreeNode DeserializeCore(String[] array) {
    index++;
    if (index >= array.length) return null;
    if (array[index].equals("$")) return null;

    TreeNode node = new TreeNode(Integer.valueOf(array[index]));

    node.left = DeserializeCore(array);
    node.right = DeserializeCore(array);

    return node;
  }
}
