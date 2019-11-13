package CodingInterviews;

public class _03_2_DuplicationInArrayNoEdit {

    public boolean duplicate(int numbers[], int length, int[] duplication) {
        if (numbers == null) return false;

        int start = 1;
        int end = numbers.length - 1;
        while (end >= start) {
            int mid = (end - start) / 2 + start;

            int count = countRange(numbers, start, mid);
            if (end == start) {
                if (count > 1) {
                    duplication[0] = start;
                    return true;
                } else {
                    break;
                }
            }

            if ((start + count) > (mid + 1)) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }

        return false;
    }

    private int countRange(int[] numbers, int start, int end) {
        if (numbers == null) return 0;

        int count = 0;
        for (int val : numbers) {
            if (val >= start && val <= end) {
                count++;
            }
        }
        return count;
    }

}
