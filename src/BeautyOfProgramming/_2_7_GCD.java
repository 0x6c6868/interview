package BeautyOfProgramming;

public class _2_7_GCD {
    public static void main(String[] args) {
        System.out.print(String.format("gcd:%s", gcd(42, 30)));
    }

    private static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
