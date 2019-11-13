package CodingInterviews;

public class _04_FindInPartiallySortedMatrix {

    public boolean Find(int target, int[][] array) {
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

}
