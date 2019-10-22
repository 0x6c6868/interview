package CodingInterviews;

public class _10_Fibonacci {
    public int fibonacci(int n) {
        if (n <= 0) {
            return 0;
        }

        int fibOne = 0;
        int fibTwo = 1;
        int fibN = fibTwo;
        for (int i = 2; i <= n; i++) {
            fibN = fibOne + fibTwo;

            fibOne = fibTwo;
            fibTwo = fibN;
        }
        return fibN;

    }

    public static void main(String[] args) {
    }
}
