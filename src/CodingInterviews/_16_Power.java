package CodingInterviews;

public class _16_Power {

    public double Power(double base, int exponent) {
        if (exponent == 0) return 1;

        boolean flag = false;
        if (exponent < 0) {
            flag = true;
            exponent = -exponent;
        }
        double rst = PowerCore(base, exponent);
        return flag ? 1 / rst : rst;
    }

    private double PowerCore(double base, int exponent) {
        if (exponent == 0) return 1;
        if (exponent % 2 == 1) {
            return PowerCore(base, exponent - 1) * base;
        } else {
            return PowerCore(base, exponent / 2) * PowerCore(base, exponent / 2);
        }
    }

}
