package CodingInterviews;

public class _42_GreatestSumOfSubarrays {

    public int FindGreatestSumOfSubArray(int[] array) {
        if (array == null || array.length == 0) return -1;

        int currSum = 0;
        int greatestSum = -1;
        for (int i = 0; i < array.length; i++) {
            if (currSum <= 0) currSum = array[i];
            else currSum += array[i];

            if (greatestSum < currSum) greatestSum = currSum;
        }

        return greatestSum;
    }

}
