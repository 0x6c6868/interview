package CodingInterviews;

import java.util.ArrayList;

public class _57_1_TwoNumbersWithSum {

    public ArrayList<Integer> FindNumbersWithSum(int[] array, int sum) {
        if (array == null || array.length == 0) return new ArrayList<>();

        int rstNumOne = 0;
        int rstNumTwo = 0;
        int multiply = Integer.MAX_VALUE;

        boolean flag = false;

        for (int i = 0; i < array.length; i++) {
            int numOne = array[i];
            int numTwo = sum - numOne;

            int numTwoIndex = findIndex(array, numTwo);
            if (numTwoIndex == -1 || numTwoIndex == i) {
                continue;
            }

            if (numOne * numTwo < multiply) {
                flag = true;
                multiply = numOne * numTwo;
                rstNumOne = numOne;
                rstNumTwo = numTwo;
            }
        }

        if (!flag) return new ArrayList<>();

        ArrayList<Integer> rst = new ArrayList<>();

        rst.add(rstNumOne);
        rst.add(rstNumTwo);

        return rst;

    }

    private int findIndex(int[] array, int curr) {

        int start = 0;
        int end = array.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (array[mid] > curr) {
                end = mid - 1;
            } else if (array[mid] < curr) {
                start = mid + 1;
            } else {
                return start;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        _57_1_TwoNumbersWithSum p = new _57_1_TwoNumbersWithSum();

        int[] array = new int[]{};
        p.FindNumbersWithSum(array, 15);
    }

}
