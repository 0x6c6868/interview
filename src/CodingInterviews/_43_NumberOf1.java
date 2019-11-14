package CodingInterviews;

public class _43_NumberOf1 {

    public int NumberOf1Between1AndN_Solution(int n) {
        if (n == 0) return 0;

        int rst = 0;
        for (int i = 1; i <= n; i *= 10) {
            int a = n / i;
            int b = n % i;

            rst += (a + 8) / 10 * i;
            if (a % 10 == 1) rst += b + 1;
        }
        return rst;
    }

}
