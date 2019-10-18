package CodingInterviews.ch02;

public class CuttingRope {

    static int maxProductAfterCutting(int length) {
        if (length < 2) return 0;
        if (length == 2) return 1;
        if (length == 3) return 2;

        int[] maxProduct = new int[length + 1];
        maxProduct[0] = 0;
        maxProduct[1] = 1;
        maxProduct[2] = 2;
        maxProduct[3] = 3;

        for (int i = 4; i <= length; i++) {
            int max = 0;
            for (int j = 1; j <= i / 2; j++) {
                int tmp = maxProduct[j] * maxProduct[i - j];
                if (tmp > max) {
                    max = tmp;
                }
            }
            maxProduct[i] = max;
        }
        return maxProduct[length];
    }

    public static void main(String[] args) {
        System.out.println(maxProductAfterCutting(1) == 0);
        System.out.println(maxProductAfterCutting(2) == 1);
        System.out.println(maxProductAfterCutting(3) == 2);
        System.out.println(maxProductAfterCutting(4));
        System.out.println(maxProductAfterCutting(5));
        System.out.println(maxProductAfterCutting(6));
        System.out.println(maxProductAfterCutting(7));
        System.out.println(maxProductAfterCutting(8));
        System.out.println(maxProductAfterCutting(9));
        System.out.println(maxProductAfterCutting(10));
    }
}
