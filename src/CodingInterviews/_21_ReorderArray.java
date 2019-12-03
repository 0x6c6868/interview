package CodingInterviews;

public class _21_ReorderArray {
    public void reOrderArray(int[] array) {
        if (array == null || array.length == 0) return;

        int curr = 0;
        while (curr < array.length) {
            if (array[curr] % 2 == 1) {
                curr++;
                continue;
            }

            int next = curr + 1;
            while (next < array.length && array[next] % 2 == 0) next++;
            if (next == array.length) break;

            int swap = array[next];
            for (int i = next; i > curr; i--) {
                array[i] = array[i - 1];
            }
            array[curr] = swap;
        }
    }
}
