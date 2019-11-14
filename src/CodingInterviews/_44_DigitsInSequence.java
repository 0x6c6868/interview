package CodingInterviews;

public class _44_DigitsInSequence {

    public int digitAtIndex(int index) {
        if (index < 0) return -1;

        int digits = 1;
        while (true) {
            int numbers = countOfIntegers(digits);
            if (index < numbers * digits)
                return digitAtIndex(index, digits);

            index -= numbers * digits;
            digits++;
        }
    }

    private int countOfIntegers(int digits) {
        if (digits == 1) return 10;

        int count = (int) Math.pow(10, digits - 1);
        return 9 * count;
    }

    private int digitAtIndex(int index, int digits) {
        int number = beginNumber(digits) + index / digits;

        int indexFromRight = digits - index % digits;
        for (int i = 1; i < indexFromRight; i++) number /= 10;

        return number % 10;
    }

    private int beginNumber(int digits) {
        if (digits == 1) return 0;

        return (int) Math.pow(10, digits - 1);
    }

    public static void main(String[] args) {
        _44_DigitsInSequence processer = new _44_DigitsInSequence();
        System.out.println(processer.digitAtIndex(0) == 0);
        System.out.println(processer.digitAtIndex(1) == 1);
        System.out.println(processer.digitAtIndex(9) == 9);
        System.out.println(processer.digitAtIndex(10) == 1);
        System.out.println(processer.digitAtIndex(189) == 9);
        System.out.println(processer.digitAtIndex(190) == 1);
        System.out.println(processer.digitAtIndex(1000) == 3);
        System.out.println(processer.digitAtIndex(1001) == 7);
        System.out.println(processer.digitAtIndex(1002) == 0);
    }

}
