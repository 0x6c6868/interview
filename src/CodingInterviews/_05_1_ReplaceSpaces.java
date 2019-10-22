package CodingInterviews;

public class _05_1_ReplaceSpaces {

    static String replaceSpace(StringBuffer str) {
        if (str == null || str.length() < 0) return str.toString();

        int len = str.length();
        int numOfBlank = 0;
        for (int i = 0; i < len; i++) {
            char val = str.charAt(i);
            if (val == ' ') {
                numOfBlank++;
            }
        }

        int newLen = len + numOfBlank * 2;
        if (newLen <= len) {
            return str.toString();
        }

        str.setLength(newLen);

        int indexOfOrginal = len - 1;
        int indexOfNew = newLen - 1;
        while (indexOfOrginal >= 0) {
            if (str.charAt(indexOfOrginal) == ' ') {
                str.replace(indexOfNew - 2, indexOfNew + 1, "%20");
                indexOfNew -= 3;
            } else {
                str.replace(indexOfNew, indexOfNew + 1, String.valueOf(str.charAt(indexOfOrginal)));
                indexOfNew -= 1;
            }
            indexOfOrginal--;
        }

        return str.toString();
    }

    public static void main(String[] args) {
        StringBuffer str = new StringBuffer();
        str.append("We are Happy.");
        System.out.println(replaceSpace(str));
    }
}
