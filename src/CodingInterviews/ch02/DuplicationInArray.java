package CodingInterviews.ch02;

public class DuplicationInArray {

    static int duplicate(int[] numbers) {

        if (numbers == null) return -1;

        for (int val : numbers) {
            if (val < 0 || val >= numbers.length) {
                return -1;
            }
        }

        for (int i = 0; i < numbers.length; i++) {
            while (numbers[i] != i) {
                if (numbers[i] == numbers[numbers[i]]) {
                    return numbers[i];
                }

                int tmp = numbers[i];
                numbers[i] = numbers[tmp];
                numbers[tmp] = tmp;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 0, 2, 5, 3};
        System.out.println(duplicate(nums));
    }
}
