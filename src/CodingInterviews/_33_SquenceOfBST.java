package CodingInterviews;

// 二叉搜索树的后序遍历序列
public class _33_SquenceOfBST {

  public boolean VerifySquenceOfBST(int[] sequence) {
    if (sequence == null || sequence.length == 0) return false;
    return judge(sequence, 0, sequence.length - 1);
  }

  public boolean judge(int[] array, int start, int end) {
    if (start >= end) return true;

    int index = end - 1;
    while (index >= start && array[index] > array[end]) index--;

    for (int j = index; j >= start; j--) if (array[j] > array[end]) return false;

    return judge(array, start, index) && judge(array, index + 1, end - 1);
  }
}
