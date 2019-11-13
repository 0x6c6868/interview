package CodingInterviews;

public class _11_MinNumberInRotatedArray {

    public int minNumberInRotateArray(int[] array) {
        if (array == null || array.length <= 0) {
            throw new IllegalArgumentException();
        }

        int start = 0;
        int end = array.length - 1;
        while (start < end) {
            if (start + 1 == end) {
                return array[end];
            }

            int mid = start + (end - start) / 2;
            if (array[start] == array[mid] && array[mid] == array[end]) {
                int tmp = array[start];
                for (int i = start + 1; i <= end; i++) {
                    if (array[i] < tmp) {
                        return array[i];
                    }
                }
                return tmp;
            }

            if (array[mid] > array[end]) {
                start = mid;
            } else {
                end = mid;
            }
        }
        return array[0];
    }

}
