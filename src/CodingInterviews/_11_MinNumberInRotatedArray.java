package CodingInterviews;

public class _11_MinNumberInRotatedArray {

    public int minNumberInRotateArray(int[] array) {
        if (array == null || array.length == 0) return 0;

        int start = 0;
        int end = array.length - 1;
        while (start <= end) {
            if (start == end) return array[start];

            if (array[start] < array[end]) return array[start];

            if (array[start] == array[end]) {
                int min = array[start];
                for (int i = start; i <= end; i++)
                    if (array[i] < min) min = array[i];
                return min;
            }

            int mid = (end - start) / 2 + start;
            if (array[start] > array[mid]) end = mid;
            else start = mid + 1;
        }
        return 0;
    }

}
