package CodingInterviews;

public class _15_NumberOf1InBinary {

    static int NumberOf1(int n) {
        int count = 0;
        while (n != 0) {
            n = n & (n - 1);
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(NumberOf1(-2147483648));
    }
}
