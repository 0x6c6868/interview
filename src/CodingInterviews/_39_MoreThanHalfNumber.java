package CodingInterviews;

public class _39_MoreThanHalfNumber {
    public int MoreThanHalfNum_Solution(int[] array) {
        if (array == null || array.length == 0) return 0;

        int start = 0;
        int end = array.length - 1;
        int index = Partition(array, start, end);
        while (index != array.length / 2) {
            if (index > array.length / 2) {
                end = index - 1;
                index = Partition(array, start, end);
            } else {
                start = index + 1;
                index = Partition(array, start, end);
            }
        }

        int times = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == array[index]) {
                times++;
            }
        }

        return times > array.length / 2 ? array[index] : 0;
    }

    public int Partition(int[] array, int start, int end) {
        int small = start - 1;
        for (int i = start; i < end; i++) {
            if (array[i] < array[end]) {
                small++;
                if (small != i) {
                    int tmp = array[i];
                    array[i] = array[small];
                    array[small] = tmp;
                }
            }
        }

        small++;
        int tmp = array[end];
        array[end] = array[small];
        array[small] = tmp;

        return small;
    }

}
