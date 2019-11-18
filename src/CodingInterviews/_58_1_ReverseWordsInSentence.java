package CodingInterviews;

public class _58_1_ReverseWordsInSentence {

    public String ReverseSentence(String str) {
        if (str == null || str.length() == 0) return str;

        StringBuilder sb = new StringBuilder(str);

        if (!str.contains(" ")) return str;

        ReverseSentenceCore(sb, 0, str.length() - 1);

        int start = 0;
        int end = 0;
        while (end < str.length()) {
            if (sb.charAt(end) != ' ') {
                end++;
                if (end == str.length())
                    ReverseSentenceCore(sb, start, end - 1);
                continue;
            }

            ReverseSentenceCore(sb, start, end - 1);
            while (end < str.length() && sb.charAt(end) == ' ') end++;

            start = end;
        }

        return sb.toString();

    }

    private void ReverseSentenceCore(StringBuilder sb, int start, int end) {
        while (start <= end) {
            char tmp = sb.charAt(start);
            sb.setCharAt(start, sb.charAt(end));
            sb.setCharAt(end, tmp);

            start++;
            end--;
        }
    }

}
