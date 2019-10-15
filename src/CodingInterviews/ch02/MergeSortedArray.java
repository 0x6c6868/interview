package CodingInterviews.ch02;

public class MergeSortedArray {

    static void merge(int[] a1, int[] a2) {
        int p1 = a1.length - 1;
        int p2 = a2.length - 1;
        int pp1 = p1;

        while (a1[p1] < 0) p1--;

        while (p1 >= 0 || p2 >= 0) {
            if (p1 >= 0 && p2 >= 0) {
                if (a1[p1] >= a2[p2]) {
                    a1[pp1] = a1[p1];
                    pp1--;
                    p1--;
                } else {
                    a1[pp1] = a2[p2];
                    pp1--;
                    p2--;
                }
            } else if (p1 >= 0) {
                a1[pp1] = a1[p1];
                pp1--;
                p1--;
            } else {
                a1[pp1] = a2[p2];
                pp1--;
                p2--;
            }
        }
    }

    public static void main(String[] args) {
        int[] a1 = {1, 3, 5, 7, 9, -1, -1, -1, -1, -1};
        int[] a2 = {2, 4, 6, 7, 8};

        merge(a1, a2);
        for (int val : a1)
            System.out.print(val);
    }
}
