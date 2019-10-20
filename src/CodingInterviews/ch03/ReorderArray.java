package CodingInterviews.ch03;

public class ReorderArray {
    static void reOrderArray(int[] array) {
        if (array == null || array.length <= 0) return;

        int curr = 0;
        while (curr < array.length) {
            if (array[curr] % 2 == 1) {
                curr++;
                continue;
            }

            int next = curr + 1;
            while (next < array.length && array[next] % 2 == 0) next++;

            if (next == array.length) break;

            int tmp = array[next];
            for (int i = next; i > curr; i--) {
                array[i] = array[i - 1];
            }
            array[curr] = tmp;
        }
    }

    public static void main(String[] args) {
        reOrderArray(new int[]{1, 3, 5, 7, 2, 4, 6});
    }
}
