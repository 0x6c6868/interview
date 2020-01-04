package CodingInterviews;

public class _42_GreatestSumOfSubarrays {

  public int FindGreatestSumOfSubArray(int[] array) {
    if (array == null || array.length == 0) return -1;

    int greatestSum = array[0];
    int currSum = array[0];
    for (int i = 1; i < array.length; i++) {
      currSum = Math.max(currSum + array[i], array[i]);
      greatestSum = Math.max(currSum, greatestSum);
    }
    return greatestSum;
  }
}
