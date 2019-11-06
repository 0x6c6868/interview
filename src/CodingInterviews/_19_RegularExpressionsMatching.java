package CodingInterviews;

public class _19_RegularExpressionsMatching {
    static boolean match(char[] str, char[] pattern) {
        if (str == null || pattern == null) return false;
        if (str.length == 0 && pattern.length == 0) return true;
        return matchCore(str, pattern, 0, 0);
    }

    static boolean matchCore(char[] str, char[] pattern, int strIndex, int patternIndex) {
        if (strIndex >= str.length && patternIndex >= pattern.length) return true;

        if (strIndex >= str.length && patternIndex < pattern.length) {
            if (patternIndex + 1 < pattern.length && pattern[patternIndex + 1] == '*' && patternIndex + 2 == pattern.length) {
                return true;
            } else {
                return false;
            }
        }

        if (patternIndex >= pattern.length) {
            return false;
        }

        if (patternIndex + 1 < pattern.length && pattern[patternIndex + 1] == '*') {
            if (str[strIndex] == pattern[patternIndex] || (pattern[patternIndex] == '.' && str[strIndex] != '\n')) {
                return matchCore(str, pattern, strIndex + 1, patternIndex + 2) ||
                        matchCore(str, pattern, strIndex + 1, patternIndex) ||
                        matchCore(str, pattern, strIndex, patternIndex + 2);
            } else {
                return matchCore(str, pattern, strIndex, patternIndex + 2);
            }
        } else if (str[strIndex] == pattern[patternIndex] || (pattern[patternIndex] == '.' && str[strIndex] != '\n')) {
            return matchCore(str, pattern, strIndex + 1, patternIndex + 1);
        }

        return false;
    }

    public static void main(String[] args) {
        char[] tmp1 = new char[]{'a'};
        char[] tmp2 = new char[]{'.'};
        match(tmp1, tmp2);
    }
}
