package CodingInterviews;

import java.util.Arrays;
import java.util.stream.Collectors;

public class _45_SortArrayForMinNumber {

  public String PrintMinNumber(int[] numbers) {
    if (numbers == null || numbers.length < 0) return null;

    return Arrays.stream(numbers)
        .mapToObj(String::valueOf)
        .sorted((m, n) -> (m + n).compareTo(n + m))
        .collect(Collectors.joining(""));
  }
}
