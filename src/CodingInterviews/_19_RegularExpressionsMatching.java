package CodingInterviews;

public class _19_RegularExpressionsMatching {

    public boolean match(char[] str, char[] pattern) {
        if (str == null || pattern == null) return false;
        return matchCore(str, 0, pattern, 0);
    }

    private boolean matchCore(char[] s, int i, char[] p, int j) {
        if (i == s.length && j == s.length) return true;

        if (j < p.length - 1 && p[j + 1] == '*') {
            if (matchCore(s, i, p, j + 2)) return true;
            if (i < s.length)
                return (s[i] == p[j] || p[j] == '.') && matchCore(s, i + 1, p, j);
        }

        if (j < p.length && p[j] == '.') return matchCore(s, i + 1, p, j + 1);

        if (i < s.length && j < p.length && s[i] == p[j]) return matchCore(s, i + 1, p, j + 1);

        return false;
    }

}
