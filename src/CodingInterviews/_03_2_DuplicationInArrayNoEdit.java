package CodingInterviews;

public class _03_2_DuplicationInArrayNoEdit {

    static int duplicate(int[] numbers) {

        if (numbers == null) return -1;

        int start = 1;
        int end = numbers.length - 1;
        while (end >= start) {
            int mid = (end - start) / 2 + start;

            int count = countRange(numbers, start, mid);
            if (end == start) {
                if (count > 1) {
                    return start;
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

        return -1;
    }

    static int countRange(int[] numbers, int start, int end) {
        if (numbers == null) return 0;

        int count = 0;
        for (int val : numbers) {
            if (val >= start && val <= end) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, 5, 4, 3, 2, 6, 7};
        System.out.println(duplicate(nums));
    }
}
