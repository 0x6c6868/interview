package CodingInterviews;

import java.util.PriorityQueue;

public class _41_StreamMedian {

    PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>((o1, o2) -> {
        return o2.compareTo(o1);
    });
    PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();

    public void Insert(Integer num) {
        if (maxHeap.isEmpty()) {
            maxHeap.offer(num);
        } else {
            if (maxHeap.peek() > num) {
                maxHeap.offer(num);
                if (maxHeap.size() - minHeap.size() > 1)
                    minHeap.offer(maxHeap.poll());
            } else {
                minHeap.offer(num);
                if (minHeap.size() - maxHeap.size() > 1)
                    maxHeap.offer(minHeap.poll());
            }
        }
    }

    public Double GetMedian() {
        if (minHeap.size() <= 0 && maxHeap.size() <= 0) return -1d;
        if (maxHeap.size() - minHeap.size() == 1) return (double) maxHeap.peek();
        if (minHeap.size() - maxHeap.size() == 1) return (double) minHeap.peek();
        return ((double) minHeap.peek() + maxHeap.peek()) / 2;
    }

}
