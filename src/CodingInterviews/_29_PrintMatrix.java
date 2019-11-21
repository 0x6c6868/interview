package CodingInterviews;

import java.util.ArrayList;

public class _29_PrintMatrix {

    static ArrayList<Integer> printMatrix(int[][] matrix) {
        if (matrix == null) return null;

        ArrayList<Integer> rst = new ArrayList<>();

        int x_end = matrix.length;
        int y_end = matrix[0].length;
        int x_start = 0;
        int y_start = 0;

        int x = 0;
        int y = 0;
        while (x_start <= x_end && y_start <= y_end) {

            // 左到右
            while (x >= x_start && x < x_end && y >= y_start && y < y_end) {
                rst.add(matrix[x][y]);
                y++;
            }
            x++;
            y--;
            x_start++;

            // 上到下
            while (x >= x_start && x < x_end && y >= y_start && y < y_end) {
                rst.add(matrix[x][y]);
                x++;
            }
            x--;
            y--;
            y_end--;

            // 右到左
            while (x >= x_start && x < x_end && y >= y_start && y < y_end) {
                rst.add(matrix[x][y]);
                y--;
            }
            x--;
            y++;
            x_end--;

            // 下到上
            while (x >= x_start && x < x_end && y >= y_start && y < y_end) {
                rst.add(matrix[x][y]);
                x--;
            }
            x++;
            y++;
            y_start++;
        }
        return rst;
    }

}
