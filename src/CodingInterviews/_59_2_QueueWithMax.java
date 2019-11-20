package CodingInterviews;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class _59_2_QueueWithMax {

    private Deque<Integer> maxDeque = new LinkedList();
    private Queue<Integer> dataQueue = new LinkedList();

    public int pop_front() {

        int val = dataQueue.poll();
        if (val == maxDeque.getFirst()) {
            maxDeque.pop();
        }

        return val;
    }

    public void push_back(int val) {
        while (!maxDeque.isEmpty() && val > maxDeque.peekLast()) {
            maxDeque.pollLast();
        }
        maxDeque.offer(val);

        dataQueue.offer(val);
    }

    public int max() {
        return maxDeque.getFirst();
    }

    public static void main(String[] args) {
        _59_2_QueueWithMax q = new _59_2_QueueWithMax();

        // {2}
        q.push_back(2);
        System.out.println(q.max() == 2);

        // {2, 3}
        q.push_back(3);
        System.out.println(q.max() == 3);

        // {2, 3, 4}
        q.push_back(4);
        System.out.println(q.max() == 4);

        // {2, 3, 4, 2}
        q.push_back(2);
        System.out.println(q.max() == 4);

        // {3, 4, 2}
        q.pop_front();
        System.out.println(q.max() == 4);

        // {4, 2}
        q.pop_front();
        System.out.println(q.max() == 4);

        // {2}
        q.pop_front();
        System.out.println(q.max() == 2);

        // {2, 6}
        q.push_back(6);
        System.out.println(q.max() == 6);

        // {2, 6, 2}
        q.push_back(2);
        System.out.println(q.max() == 6);

        // {2, 6, 2, 5}
        q.push_back(5);
        System.out.println(q.max() == 6);

        // {6, 2, 5}
        q.pop_front();
        System.out.println(q.max() == 6);

        // {2, 5}
        q.pop_front();
        System.out.println(q.max() == 5);

        // {5}
        q.pop_front();
        System.out.println(q.max() == 5);

        // {5, 1}
        q.push_back(1);
        System.out.println(q.max() == 5);
    }
}
