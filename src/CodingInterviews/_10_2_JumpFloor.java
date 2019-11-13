package CodingInterviews;

public class _10_2_JumpFloor {

    public int JumpFloor(int target) {
        if (target <= 0) {
            return 0;
        }

        int fibOne = 1;
        int fibTwo = 1;
        int fibN = fibTwo;
        for (int i = 2; i <= target; i++) {
            fibN = fibOne + fibTwo;

            fibOne = fibTwo;
            fibTwo = fibN;
        }
        return fibN;
    }

}
