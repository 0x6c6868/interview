package CodingInterviews;

import java.util.LinkedList;
import java.util.Queue;

public class _09_2_StackWithTwoQueues {

    static Queue<Integer> queue1 = new LinkedList<Integer>();
    static Queue<Integer> queue2 = new LinkedList<Integer>();

    static void push(int node) {
        while (!queue2.isEmpty()) {
            queue1.offer(queue2.poll());
        }
    }

    static int pop() {
        while (!queue2.isEmpty()) {
            queue2.offer(queue1.poll());
        }
        return queue2.poll();
    }

    public static void main(String[] args) {
    }
}
