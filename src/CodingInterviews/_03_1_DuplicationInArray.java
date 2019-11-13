package CodingInterviews;

public class _03_1_DuplicationInArray {

    public boolean duplicate(int numbers[], int length, int[] duplication) {

        if (numbers == null) return false;

        for (int val : numbers) {
            if (val < 0 || val >= numbers.length) {
                return false;
            }
        }

        for (int i = 0; i < numbers.length; i++) {
            while (numbers[i] != i) {
                if (numbers[i] == numbers[numbers[i]]) {
                    duplication[0] = numbers[i];
                    return true;
                }

                int tmp = numbers[i];
                numbers[i] = numbers[tmp];
                numbers[tmp] = tmp;
            }
        }
        return false;
    }

}
