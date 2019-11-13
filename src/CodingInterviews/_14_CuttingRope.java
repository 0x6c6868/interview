package CodingInterviews;

public class _14_CuttingRope {

    public int cutRope(int target) {
        if (target < 2) return 0;
        if (target == 2) return 1;
        if (target == 3) return 2;

        int[] maxProduct = new int[target + 1];
        maxProduct[0] = 0;
        maxProduct[1] = 1;
        maxProduct[2] = 2;
        maxProduct[3] = 3;

        for (int i = 4; i <= target; i++) {
            int max = 0;
            for (int j = 1; j <= i / 2; j++) {
                int tmp = maxProduct[j] * maxProduct[i - j];
                if (tmp > max) {
                    max = tmp;
                }
            }
            maxProduct[i] = max;
        }
        return maxProduct[target];
    }

}
