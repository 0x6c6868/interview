package BeautyOfProgramming;

/**
 * 求二进制数中1的个数
 */
public class _2_01_CountOne {
    public static void main(String[] args) {
        int num = 0b10100010;
        System.out.print(String.format("count:%s", process(num)));
    }

    private static int process(int num) {
        int rst = 0;
        while (num != 0) {
            num &= (num - 1);
            rst++;
        }
        return rst;
    }
}
