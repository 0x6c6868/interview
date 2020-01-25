package CodingInterviews;

// leetcode 3
public class _48_LongestSubstringWithoutDup {
  public int lengthOfLongestSubstring(String s) {
    if (s == null || s.length() == 0) return 0;

    char[] data = s.toCharArray();
    int[] maxTmp = new int[data.length];

    int max = 1;
    maxTmp[0] = 1;
    for (int i = 1; i < data.length; i++) {
      for (int j = 1; j <= maxTmp[i - 1]; j++) if (data[i] == data[i - j]) maxTmp[i] = j;
      if (maxTmp[i] == 0) maxTmp[i] = maxTmp[i - 1] + 1;
      if (maxTmp[i] > max) max = maxTmp[i];
    }

    return max;
  }
}
