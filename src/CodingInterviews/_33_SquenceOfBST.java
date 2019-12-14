package CodingInterviews;

import java.util.ArrayList;

public class _33_SquenceOfBST {

    public boolean VerifySquenceOfBST(int[] sequence) {
        if (sequence == null || sequence.length == 0) return false;
        return core(sequence, 0, sequence.length - 1);
    }

    public boolean core(int[] array, int start, int end) {
        if (start >= end) return true;
        int rootVal = array[end];
        int index;
        for (index = start; index <= end; index++) {
            if (array[index] >= rootVal) break;
        }

        for (int i = index; i <= end; i++) {
            if (array[i] < rootVal) return false;
        }

        if (index > start && !core(array, start, index - 1)) return false;
        if (index < end && !core(array, index, end - 1)) return false;
        return true;
    }

}
