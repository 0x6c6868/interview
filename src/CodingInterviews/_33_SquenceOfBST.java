package CodingInterviews;

public class _33_SquenceOfBST {

    public boolean verifySquenceOfBST(int[] sequence) {
        if (sequence == null || sequence.length == 0) return false;
        return verifySquenceOfBSTCore(sequence, 0, sequence.length - 1);
    }

    private boolean verifySquenceOfBSTCore(int[] sequence, int start, int end) {
        if (start >= end) return true;

        int leftIndex = start;
        while (sequence[leftIndex] < sequence[end] && leftIndex <= end) leftIndex++;

        if (leftIndex < end) {
            for (int i = leftIndex; i <= end; i++) {
                if (sequence[i] < sequence[end]) {
                    return false;
                }
            }
        }

        boolean leftFlag = true;
        if (leftIndex > start) {
            leftFlag = verifySquenceOfBSTCore(sequence, start, leftIndex - 1);
        }

        boolean rightFlag = true;
        if (leftIndex < end) {
            rightFlag = verifySquenceOfBSTCore(sequence, leftIndex, end - 1);
        }

        return leftFlag && rightFlag;
    }

}
