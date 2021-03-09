package BeautyOfProgramming;

/**
 * 寻找数组中的最大值和最小值
 */
public class _2_10_MaxAndMinInArray {
    public static void main(String[] args) {
        int[] arr = new int[]{5, 6, 8, 3, 7, 9};
        int[] rst = process(arr, 0, arr.length - 1);
        System.out.print(String.format("min:%s,max:%s", rst[0], rst[1]));
    }

    private static int[] process(int[] arr, int i, int j) {
        if (i > j) return null;
        if (i == j) return new int[]{arr[i], arr[j]};

        int[] rstL = process(arr, i, (j - i) / 2 + i);
        int[] rstR = process(arr, (j - i) / 2 + i + 1, j);

        return new int[]{Math.min(rstL[0], rstR[0]), Math.max(rstL[1], rstR[1])};
    }
}
