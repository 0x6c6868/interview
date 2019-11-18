package CodingInterviews;

public class _56_2_NumberAppearingOnce {

    public int FindNumberAppearingOnce(int[] array) {
        if (array == null || array.length == 0) return -1;

        int[] bitSum = new int[32];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < bitSum.length; j++) {
                if ((array[i] & (1 << j)) != 0) {
                    bitSum[j] += 1;
                }
            }
        }

        int rst = 0;
        for (int i = 0; i < bitSum.length; i++) {
            if (bitSum[i] % 3 != 0) {
                rst += 1 << i;
            }
        }
        return rst;
    }

    public static void main(String[] args) {
        _56_2_NumberAppearingOnce p = new _56_2_NumberAppearingOnce();
        int[] array = null;

        array = new int[]{1, 1, 2, 2, 2, 1, 3};
        System.out.println(p.FindNumberAppearingOnce(array) == 3);

        array = new int[]{4, 3, 3, 2, 2, 2, 3};
        System.out.println(p.FindNumberAppearingOnce(array) == 4);

        array = new int[]{4, 4, 1, 1, 1, 7, 4};
        System.out.println(p.FindNumberAppearingOnce(array) == 7);

        array = new int[]{-10, 214, 214, 214};
        System.out.println(p.FindNumberAppearingOnce(array) == -10);

        array = new int[]{-209, 3467, -209, -209};
        System.out.println(p.FindNumberAppearingOnce(array) == 3467);

        array = new int[]{1024, -1025, 1024, -1025, 1024, -1025, 1023};
        System.out.println(p.FindNumberAppearingOnce(array) == 1023);

        array = new int[]{-1024, -1024, -1024, -1023};
        System.out.println(p.FindNumberAppearingOnce(array) == -1023);

        array = new int[]{-23, 0, 214, -23, 214, -23, 214};
        System.out.println(p.FindNumberAppearingOnce(array) == 0);

        array = new int[]{0, 3467, 0, 0, 0, 0, 0, 0};
        System.out.println(p.FindNumberAppearingOnce(array) == 3467);
    }

}
