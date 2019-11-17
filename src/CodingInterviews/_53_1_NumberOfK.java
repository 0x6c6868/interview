package CodingInterviews;

public class _53_1_NumberOfK {

    public int GetNumberOfK(int[] array, int k) {
        if (array == null || array.length == 0) return 0;

        int firstKIndex = FindFirstKIndex(array, k, 0, array.length - 1);
        if (firstKIndex < 0) return 0;
        int lastKIndex = FindLastKIndex(array, k, 0, array.length - 1);

        return lastKIndex - firstKIndex + 1;
    }

    private int FindFirstKIndex(int[] array, int k, int start, int end) {
        int firstKIndex = -1;
        while (start <= end) {

            if (array[start] == array[end]) {
                if (array[start] == k) firstKIndex = start;
                break;
            }

            int mid = start + (end - start) / 2;
            if (array[mid] > k) {
                end = mid - 1;
            } else if (array[mid] < k) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return firstKIndex;
    }

    private int FindLastKIndex(int[] array, int k, int start, int end) {
        int lastKIndex = -1;
        while (start <= end) {

            if (array[start] == array[end]) {
                if (array[start] == k) lastKIndex = end;
                break;
            }

            int mid = start + (end - start) / 2;
            if (array[mid] > k) {
                end = mid - 1;
            } else if (array[mid] < k) {
                start = mid + 1;
            } else {
                start = mid;
            }
        }
        return lastKIndex;
    }

}
