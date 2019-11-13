package CodingInterviews;

public class _16_Power {

    public double Power(double base, int exponent) {
        int realExponent = exponent;
        if (exponent < 0) {
            if (base == 0) {
                throw new RuntimeException("输入不合法");
            }
            realExponent = -exponent;
        }

        double rst = 1;
        while (realExponent > 0) {
            if ((realExponent & 1) > 0) {
                rst *= base;
                realExponent -= 1;
            } else {
                rst *= rst;
                realExponent /= 2;
            }
        }
        return exponent > 0 ? rst : 1 / rst;
    }

}
