package CodingInterviews;

public class _51_InversePairs {

    private int cnt;

    private void Sort(int[] array, int start, int end) {
        if (start >= end) return;
        int mid = (start + end) / 2;
        Sort(array, start, mid);
        Sort(array, mid + 1, end);
        Merge(array, start, mid, end);
    }

    private void Merge(int[] array, int start, int mid, int end) {
        int[] temp = new int[end - start + 1];
        int k = 0, i = start, j = mid + 1;
        while (i <= mid && j <= end) {
            if (array[i] <= array[j])
                temp[k++] = array[i++];
            else {
                temp[k++] = array[j++];
                cnt = (cnt + (mid - i + 1)) % 1000000007;
            }
        }
        while (i <= mid)
            temp[k++] = array[i++];
        while (j <= end)
            temp[k++] = array[j++];
        for (int l = 0; l < k; l++) {
            array[start + l] = temp[l];
        }
    }

    public int InversePairs(int[] array) {
        Sort(array, 0, array.length - 1);
        return cnt;
    }

}
