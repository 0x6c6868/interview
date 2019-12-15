package CodingInterviews;

public class _19_RegularExpressionsMatching {

  public boolean match(char[] str, char[] pattern) {
    if (str == null || pattern == null) return false;

    boolean dp[][] = new boolean[str.length + 1][pattern.length + 1];
    dp[0][0] = true;
    for (int i = 1; i <= pattern.length; i++) if (pattern[i - 1] == '*') dp[0][i] = dp[0][i - 2];

    for (int i = 1; i <= str.length; i++)
      for (int j = 1; j <= pattern.length; j++)
        if (str[i - 1] == pattern[j - 1] || pattern[j - 1] == '.') dp[i][j] = dp[i - 1][j - 1];
        else if (pattern[j - 1] == '*') {
          if (str[i - 1] != pattern[j - 2] && pattern[j - 2] != '.') dp[i][j] = dp[i][j - 2];
          else dp[i][j] = dp[i - 1][j] || dp[i][j - 1] || dp[i][j - 2];
        }

    return dp[str.length][pattern.length];
  }
}
