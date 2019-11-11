package CodingInterviews;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class _38_StringPermutation {

    public ArrayList<String> Permutation(String str) {
        if (str == null || str.length() == 0) return new ArrayList<>();

        ArrayList<String> rst = new ArrayList<>();
        PermutationCore(str.split(""), 0, str.length() - 1, rst);

        return (ArrayList<String>) rst.stream().distinct().sorted().collect(Collectors.toList());
    }

    public void PermutationCore(String[] strList, int start, int end,
                                ArrayList<String> rst) {
        if (start > end) return;
        if (start == end) rst.add(String.join("", strList));

        for (int curr = start; curr <= end; curr++) {
            String tmp = strList[curr];
            strList[curr] = strList[start];
            strList[start] = tmp;

            PermutationCore(strList, start + 1, end, rst);

            strList[start] = strList[curr];
            strList[curr] = tmp;
        }
    }
}
