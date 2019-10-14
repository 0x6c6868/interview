package CodingInterviews.ch02;

public class FindInPartiallySortedMatrix {

    static boolean find(int[][] array, int target) {
        if (array == null) return false;

        int rows = array.length;
        if (rows < 1) return false;

        int cols = array[0].length;
        if (cols < 1) return false;

        int row = 0;
        int col = cols - 1;
        while (row < rows && col >= 0) {
            if (array[row][col] == target) {
                return true;
            }

            if (array[row][col] > target) {
                col = col - 1;
            } else if (array[row][col] < target) {
                row = row + 1;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 8, 9},
                {2, 4, 9, 12},
                {4, 7, 10, 13},
                {6, 8, 11, 15}
        };
        System.out.println(find(array, 5));
    }
}
