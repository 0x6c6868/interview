package CodingInterviews;

import java.util.ArrayList;

public class _29_PrintMatrix {
    public ArrayList<Integer> printMatrix(int[][] matrix) {
        if (matrix == null) return null;

        int rows = matrix.length;
        int cols = matrix[0].length;

        ArrayList<Integer> rst = new ArrayList();
        for (int i = 0; i < rows && i < cols; i++) {
            ArrayList<Integer> tmpList = Core(matrix, i, rows - 1 - i, i, cols - 1 - i);
            if (tmpList == null) break;
            rst.addAll(tmpList);
        }
        return rst;
    }

    private ArrayList<Integer> Core(int[][] a, int i, int j, int x, int y) {
        ArrayList<Integer> rst = new ArrayList();
        if (i > j || x > y) return null;

        for (int t = x; t <= y; t++) rst.add(a[i][t]);
        for (int t = i + 1; t <= j; t++) rst.add(a[t][y]);
        if (i < j)
            for (int t = y - 1; t >= x; t--) rst.add(a[j][t]);
        if (x < y)
            for (int t = j - 1; t > i; t--) rst.add(a[t][x]);
        return rst;
    }

}
