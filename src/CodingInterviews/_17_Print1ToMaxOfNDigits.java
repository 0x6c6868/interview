package CodingInterviews;

public class _17_Print1ToMaxOfNDigits {
    public void print1ToMaxOfNDigits(int n) {
        if (n <= 0) return;
        char[] array = new char[n];
        core(array, 0);
    }

    private void core(char[] array, int index) {
        if (index >= array.length) {
            boolean flag = false;
            for (int i = 0; i < array.length; i++) {
                if (array[i] != '0' || flag) {
                    System.out.print(array[i]);
                    flag = true;
                }
            }
            System.out.println();
            return;
        }

        for (char i = '0'; i <= '9'; i++) {
            array[index] = i;
            core(array, index + 1);
        }
    }

    public static void main(String[] args) {
        _17_Print1ToMaxOfNDigits p = new _17_Print1ToMaxOfNDigits();
        p.print1ToMaxOfNDigits(2);
    }
}
