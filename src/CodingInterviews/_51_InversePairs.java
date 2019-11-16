package CodingInterviews;

/**
 * TODO AC不过
 */
public class _51_InversePairs {

    public int InversePairs(int[] array) {
        if (array == null || array.length == 0) return 0;
        int[] copy = new int[array.length];
        return InversePairsCore(array, copy, 0, array.length - 1);
    }

    private int InversePairsCore(int[] array, int[] copy, int start, int end) {
        if (start == end) {
            copy[start] = array[start];
            return 0;
        }

        int mid = (end - start) / 2 + start;

        int left = InversePairsCore(array, copy, start, mid);
        int right = InversePairsCore(array, copy, mid + 1, end);

        int count = 0;
        int p1 = mid;
        int p2 = end;
        int indexCopy = end;
        while (p1 >= start && p2 >= mid + 1) {
            if (p1 >= start && array[p1] > array[p2]) {
                copy[indexCopy] = array[p1];
                p1--;
                count += (p2 - mid) % 1000000007;
            } else {
                copy[indexCopy] = array[p2];
                p2--;
            }
            indexCopy--;
        }

        while (p1 >= start) {
            copy[indexCopy] = array[p1];
            p1--;
            indexCopy--;
        }

        while (p2 >= mid + 1) {
            copy[indexCopy] = array[p2];
            p2--;
            indexCopy--;
        }

        for (int i = start; i <= end; i++) array[i] = copy[i];

        return (left + right + count) % 1000000007;
    }

}
