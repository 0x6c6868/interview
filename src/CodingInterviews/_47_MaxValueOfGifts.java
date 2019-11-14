package CodingInterviews;

public class _47_MaxValueOfGifts {

    public int getMaxValue_solution1(int[][] values) {
        if (values == null || values.length <= 0) return 0;

        int rows = values.length;
        int cols = values[0].length;

        int[][] maxValues = new int[rows][cols];
        int i = rows - 1;
        int j = cols - 1;
        maxValues[i][j] = values[i][j];
        while (i >= 0 || j >= 0) {
            int left = 0;
            int up = 0;

            if (j > 0) {
                left = maxValues[i][j] + values[i][j - 1];
            }

            if (i > 0) {
                up = maxValues[i][j] + values[i - 1][j];
            }

            if (left == 0 && up == 0) break;

            if (left > up) {
                j--;
                maxValues[i][j] = left;
            } else {
                i--;
                maxValues[i][j] = up;
            }
        }

        return maxValues[0][0];
    }

    public static void main(String[] args) {
        _47_MaxValueOfGifts processer = new _47_MaxValueOfGifts();

        int[][] tmp = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println(processer.getMaxValue_solution1(tmp) == 29);

        tmp = new int[][]{
                {1, 10, 3, 8},
                {12, 2, 9, 6},
                {5, 7, 4, 11},
                {3, 7, 16, 5}
        };
        System.out.println(processer.getMaxValue_solution1(tmp) == 53);

        tmp = new int[][]{{1, 10, 3, 8}};
        System.out.println(processer.getMaxValue_solution1(tmp) == 22);

        tmp = new int[][]{{1}, {12}, {5}, {3}};
        System.out.println(processer.getMaxValue_solution1(tmp) == 21);

        tmp = new int[][]{{3}};
        System.out.println(processer.getMaxValue_solution1(tmp) == 3);

        tmp = null;
        System.out.println(processer.getMaxValue_solution1(tmp) == 0);
    }

}
