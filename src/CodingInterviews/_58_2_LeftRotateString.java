package CodingInterviews;

public class _58_2_LeftRotateString {

    public String LeftRotateString(String str, int n) {
        if (str == null || str.length() == 0) return str;

        int length = str.length();
        n = n % length;

        if (n == 0) return str;

        return str.substring(n, str.length()) + str.substring(0, n);
    }

}
