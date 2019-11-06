package CodingInterviews;

public class _20_NumericStrings {
    static boolean isNumeric(char[] str) {
        if (str == null) return false;

        boolean numeric = false;
        int index = scanInteger(str, 0);
        numeric = index > 0;

        if (index < str.length && str[index] == '.') {
            int tmpIndex = index + 1;
            index = scanUnsignedInteger(str, tmpIndex);
            numeric = numeric || index > tmpIndex;
        }

        if (index < str.length && (str[index] == 'e' || str[index] == 'E')) {
            int tmpIndex = index + 1;
            if (tmpIndex < str.length) {
                index = scanInteger(str, tmpIndex);
                numeric = numeric && index > tmpIndex;
            }
        }

        return numeric && index == str.length;
    }

    static int scanUnsignedInteger(char[] str, int index) {
        while (index < str.length && str[index] >= '0' && str[index] <= '9')
            index++;
        return index;
    }

    static int scanInteger(char[] str, int index) {
        if (str[index] == '+' || str[index] == '-')
            return scanUnsignedInteger(str, index + 1);
        return scanUnsignedInteger(str, index);
    }

    public static void main(String[] args) {
        char[] rst = new char[]{'+', '-', '5'};
        isNumeric(rst);
    }
}
