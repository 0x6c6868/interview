package CodingInterviews;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

public class _59_1_MaxInSlidingWindow {

    public ArrayList<Integer> maxInWindows(int[] num, int size) {
        ArrayList<Integer> rst = new ArrayList<>();

        if (num == null || num.length == 0 || size == 0) return rst;

        Deque<Integer> deque = new LinkedList();
        int start = 0;
        int end = 0;
        while (end < num.length) {

            while (!deque.isEmpty() && num[end] > deque.peekLast()) {
                deque.pollLast();
            }

            deque.offer(num[end]);

            if (end - start < size - 1) {
                end++;
                continue;
            }

            rst.add(deque.peek());

            if (num[start] == deque.peek()) {
                deque.pollFirst();
            }

            start++;
            end++;
        }

        return rst;
    }

    public static void main(String[] args) {
        _59_1_MaxInSlidingWindow p = new _59_1_MaxInSlidingWindow();

        int[] num = new int[]{10, 14, 12, 11};
        p.maxInWindows(num, 0);
    }

}
