package CodingInterviews;

public class _39_MoreThanHalfNumber {
    public int MoreThanHalfNum_Solution(int[] array) {
        if (array == null || array.length == 0) return 0;

        int result = array[0];
        int times = 1;
        for (int i = 1; i < array.length; i++) {
            if (array[i] == result) {
                times++;
            } else {
                if (times == 0) {
                    result = array[i];
                    times = 1;
                } else {
                    times--;
                }
            }
        }

        times = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == result) times++;
            else times--;
        }

        return times > 0 ? result : 0;
    }

}
