package CodingInterviews;

// 数值的整数次方
public class _16_Power {

  public double Power(double base, int exponent) {

    int realExponent = Math.abs(exponent);
    double res = 1;
    while (realExponent > 0) {
      if ((realExponent & 1) == 1) res *= base;
      base *= base;
      realExponent >>= 1;
    }
    return exponent < 0 ? 1 / res : res;
  }
}
