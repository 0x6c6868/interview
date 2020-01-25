package CodingInterviews;

import java.util.ArrayList;
import java.util.stream.Collectors;

// 字符串的排列
public class _38_StringPermutation {

  private int strLen = 0;

  public ArrayList<String> Permutation(String str) {
    if (str == null || str.length() == 0) return new ArrayList<>();
    strLen = str.length();

    ArrayList<String> rst = new ArrayList<>();
    PermutationCore(str.split(""), 0, rst);

    return (ArrayList<String>) rst.stream().distinct().sorted().collect(Collectors.toList());
  }

  private void PermutationCore(String[] strList, int index, ArrayList<String> rst) {
    if (index >= strLen) return;
    if (index == strLen - 1) rst.add(String.join("", strList));

    for (int curr = index; curr < strLen; curr++) {
      String tmp = strList[curr];
      strList[curr] = strList[index];
      strList[index] = tmp;

      PermutationCore(strList, index + 1, rst);

      strList[index] = strList[curr];
      strList[curr] = tmp;
    }
  }
}
