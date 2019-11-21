package CodingInterviews;

public class _67_StringToInt {

    public int StrToInt(String str) {
        if (str == null || str.length() == 0) return 0;

        boolean isPositive = true;
        long rst = 0;
        for (int i = 0; i < str.length(); i++) {

            if (i == 0 && str.charAt(i) == '-') {
                isPositive = false;
                continue;
            }

            if (i == 0 && str.charAt(i) == '+') {
                continue;
            }

            if (str.charAt(i) < '0' || str.charAt(i) > '9') {
                return 0;
            }

            rst = rst * 10 + (str.charAt(i) - '0');
        }

        rst = isPositive ? rst : -rst;

        if (rst > Integer.MAX_VALUE || rst < Integer.MIN_VALUE) return 0;

        return (int) rst;
    }

}
