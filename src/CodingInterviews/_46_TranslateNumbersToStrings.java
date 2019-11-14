package CodingInterviews;

public class _46_TranslateNumbersToStrings {

    public int getTranslationCount(int number) {
        if (number < 0) return 0;

        String numberStr = String.valueOf(number);
        char[] numberArray = numberStr.toCharArray();

        int[] counts = new int[numberArray.length];

        for (int i = numberArray.length - 1; i >= 0; i--) {
            int count;
            if (i < numberArray.length - 1) {
                count = counts[i + 1];
            } else {
                count = 1;
            }

            if (i < numberArray.length - 1) {
                int digit1 = numberArray[i] - '0';
                int digit2 = numberArray[i + 1] - '0';

                int digit = digit1 * 10 + digit2;
                if (digit >= 10 && digit <= 25) {
                    if (i < numberArray.length - 2) {
                        count += counts[i + 2];
                    } else {
                        count += 1;
                    }
                }
            }

            counts[i] = count;
        }

        return counts[0];
    }

    public static void main(String[] args) {
        _46_TranslateNumbersToStrings processer = new _46_TranslateNumbersToStrings();
        System.out.println(processer.getTranslationCount(0) == 1);
        System.out.println(processer.getTranslationCount(10) == 2);
        System.out.println(processer.getTranslationCount(125) == 3);
        System.out.println(processer.getTranslationCount(126) == 2);
        System.out.println(processer.getTranslationCount(426) == 1);
        System.out.println(processer.getTranslationCount(100) == 2);
        System.out.println(processer.getTranslationCount(101) == 2);
        System.out.println(processer.getTranslationCount(12258) == 5);
        System.out.println(processer.getTranslationCount(-100) == 0);
    }
}
