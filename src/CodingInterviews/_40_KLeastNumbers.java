package CodingInterviews;

import java.util.ArrayList;

public class _40_KLeastNumbers {
    public ArrayList<Integer> GetLeastNumbers_Solution(int[] input, int k) {
        if (input == null || input.length == 0 || k <= 0 || k > input.length) return new ArrayList<>();

        int start = 0;
        int end = input.length - 1;
        int index = Partition(input, start, end);
        while (index != k - 1) {
            if (index > k - 1) {
                end = index - 1;
                index = Partition(input, start, end);
            } else {
                start = index + 1;
                index = Partition(input, start, end);
            }
        }

        ArrayList<Integer> rst = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            rst.add(input[i]);
        }
        return rst;
    }

    public int Partition(int[] array, int start, int end) {
        int small = start - 1;
        for (int i = start; i < end; i++) {
            if (array[i] < array[end]) {
                small++;
                if (small != i) {
                    int tmp = array[i];
                    array[i] = array[small];
                    array[small] = tmp;
                }
            }
        }

        small++;
        int tmp = array[end];
        array[end] = array[small];
        array[small] = tmp;

        return small;
    }

}
