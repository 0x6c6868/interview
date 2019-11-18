package CodingInterviews;

import java.util.ArrayList;

public class _57_2_ContinuousSquenceWithSum {

    public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {

        ArrayList<ArrayList<Integer>> rst = new ArrayList<>();

        int start = 1;
        int end = 2;
        int tmp = start + end;
        while (start != end) {

            if (tmp == sum) {

                ArrayList<Integer> subRst = new ArrayList<>();
                for (int i = start; i <= end; i++) {
                    subRst.add(i);
                }
                rst.add(subRst);

                start++;
                tmp -= start;
                tmp++;
            }

            if (tmp < sum) {
                end++;
                tmp += end;
            } else {
                start++;
                tmp -= start;
                tmp++;
            }
        }

        return rst;
    }

}
