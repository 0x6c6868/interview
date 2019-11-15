package CodingInterviews;

public class _48_LongestSubstringWithoutDup {

    public int longestSubstringWithoutDuplication(String str) {
        if (str == null || str.length() <= 0) return 0;

        int[] maxLengthArray = new int[str.length()];
        maxLengthArray[0] = 1;

        for (int i = 1; i < str.length(); i++) {
            int distance = getDistance(str, i);
            if (distance > 0 && distance <= maxLengthArray[i - 1]) {
                maxLengthArray[i] = distance;
                continue;
            }
            maxLengthArray[i] = maxLengthArray[i - 1] + 1;
        }

        int max = 0;
        for (int i = 0; i < maxLengthArray.length; i++) {
            if (maxLengthArray[i] > max) max = maxLengthArray[i];
        }
        return max;
    }

    private int getDistance(String str, int index) {
        int currIndex = index - 1;
        while (currIndex >= 0) {
            if (str.charAt(currIndex) == str.charAt(index)) {
                return index - currIndex;
            }
            currIndex--;
        }
        return -1;
    }

    public static void main(String[] args) {
        _48_LongestSubstringWithoutDup processer = new _48_LongestSubstringWithoutDup();

        System.out.println(processer.longestSubstringWithoutDuplication("abcacfrar") == 4);
        System.out.println(processer.longestSubstringWithoutDuplication("acfrarabc") == 4);
        System.out.println(processer.longestSubstringWithoutDuplication("arabcacfr") == 4);
        System.out.println(processer.longestSubstringWithoutDuplication("aaaa") == 1);
        System.out.println(processer.longestSubstringWithoutDuplication("abcdefg") == 7);
        System.out.println(processer.longestSubstringWithoutDuplication("aaabbbccc") == 2);
        System.out.println(processer.longestSubstringWithoutDuplication("abcdcba") == 4);
        System.out.println(processer.longestSubstringWithoutDuplication("abcdaef") == 6);
        System.out.println(processer.longestSubstringWithoutDuplication("a") == 1);
        System.out.println(processer.longestSubstringWithoutDuplication("") == 0);
    }
}
