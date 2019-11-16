package CodingInterviews;

public class _49_UglyNumber {

    public int GetUglyNumber_Solution(int index) {
        if (index <= 0) return 0;

        int[] uglyArray = new int[index];
        uglyArray[0] = 1;
        int nextUglyIndex = 1;

        int index2 = 0;
        int index3 = 0;
        int index5 = 0;

        while (nextUglyIndex < index) {
            int nextUglyValue = min(
                    uglyArray[index2] * 2,
                    uglyArray[index3] * 3,
                    uglyArray[index5] * 5
            );
            uglyArray[nextUglyIndex] = nextUglyValue;

            while (uglyArray[index2] * 2 <= uglyArray[nextUglyIndex]) index2++;
            while (uglyArray[index3] * 3 <= uglyArray[nextUglyIndex]) index3++;
            while (uglyArray[index5] * 5 <= uglyArray[nextUglyIndex]) index5++;

            nextUglyIndex++;
        }
        return uglyArray[nextUglyIndex - 1];
    }

    private int min(int val2, int val3, int val5) {
        int min = val2 > val3 ? val3 : val2;
        return min > val5 ? val5 : min;
    }

}
