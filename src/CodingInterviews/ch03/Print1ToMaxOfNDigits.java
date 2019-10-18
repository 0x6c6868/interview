package CodingInterviews.ch03;

public class Print1ToMaxOfNDigits {
    static void print1ToMaxOfNDigits(int n) {
        if (n <= 0) return;
        int[] rst = new int[n];
        printCore(rst, 0);
    }

    static void printCore(int[] rst, int index) {
        if (index == rst.length) {
            print(rst);
            return;
        }

        for (int i = 0; i <= 9; i++) {
            rst[index] = i;
            printCore(rst, index + 1);
        }
    }

    static void print(int[] rst) {
        int i = 0;
        while (i < rst.length && rst[i] == 0) {
            i++;
        }

        if (i == rst.length) {
            System.out.println(0);
            return;
        }

        for (int j = i; j < rst.length; j++) {
            System.out.print(rst[j]);
        }
        // 换行
        System.out.println();
    }

    public static void main(String[] args) {
        print1ToMaxOfNDigits(3);
    }
}
