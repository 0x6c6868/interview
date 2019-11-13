package CodingInterviews;

import java.util.ArrayList;
import java.util.List;

public class _45_SortArrayForMinNumber {

    public String PrintMinNumber(int[] numbers) {
        if (numbers == null || numbers.length < 0) return null;

        List<String> strNumList = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            strNumList.add(String.valueOf(numbers[i]));
        }

        strNumList.sort((m, n) -> {
            String mn = m + n;
            String nm = n + m;
            return mn.compareTo(nm);

        });

        return String.join("", strNumList);
    }

}
