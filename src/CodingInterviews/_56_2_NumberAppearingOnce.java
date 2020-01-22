package CodingInterviews;

/** leetcode 137 */
public class _56_2_NumberAppearingOnce {

  public int singleNumber(int[] nums) {
    int ones = 0, twos = 0;
    for (int num : nums) {
      ones = ones ^ num & ~twos;
      twos = twos ^ num & ~ones;
    }
    return ones;
  }
}
