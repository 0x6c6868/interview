package CodingInterviews;

public class _63_MaximalProfit {

    public int MaxDiff(int[] numbers) {
        if (numbers == null || numbers.length < 2) return 0;

        int min = numbers[0];
        int maxDiff = Integer.MIN_VALUE;
        for (int i = 1; i < numbers.length; i++) {
            if (min > numbers[i - 1]) min = numbers[i - 1];

            if (numbers[i] - min > maxDiff) maxDiff = numbers[i] - min;
        }
        return maxDiff;
    }

    public static void main(String[] args) {
        _63_MaximalProfit p = new _63_MaximalProfit();
        int[] numbers = null;

        numbers = new int[]{4, 1, 3, 2, 5};
        System.out.println(p.MaxDiff(numbers) == 4);

        numbers = new int[]{1, 2, 4, 7, 11, 16};
        System.out.println(p.MaxDiff(numbers) == 15);

        numbers = new int[]{16, 11, 7, 4, 2, 1};
        System.out.println(p.MaxDiff(numbers) == -1);

        numbers = new int[]{16, 16, 16, 16, 16};
        System.out.println(p.MaxDiff(numbers) == 0);

        numbers = new int[]{9, 11, 5, 7, 16, 1, 4, 2};
        System.out.println(p.MaxDiff(numbers) == 11);

        numbers = new int[]{2, 4};
        System.out.println(p.MaxDiff(numbers) == 2);

        numbers = new int[]{4, 2};
        System.out.println(p.MaxDiff(numbers) == -2);

        numbers = null;
        System.out.println(p.MaxDiff(numbers) == 0);
    }

}
