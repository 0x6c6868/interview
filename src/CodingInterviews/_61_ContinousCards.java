package CodingInterviews;

import java.util.Arrays;

public class _61_ContinousCards {

    public boolean isContinuous(int[] numbers) {
        if (numbers == null || numbers.length == 0) return false;

        Arrays.sort(numbers);

        long numOfZero = 0;
        long numOfGap = 0;

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] == 0) {
                numOfZero++;
                continue;
            }

            if (i != 0 && numbers[i - 1] != 0) {
                if (numbers[i] == numbers[i - 1]) return false;
                numOfGap += (numbers[i] - numbers[i - 1]) - 1;
            }
        }

        if (numOfZero < numOfGap) {
            return false;
        }
        return true;
    }

}
