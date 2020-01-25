package CodingInterviews;

import java.util.PriorityQueue;

// 数据流中的中位数
public class _41_StreamMedian {

  private PriorityQueue<Integer> minHeap = new PriorityQueue<>();
  private PriorityQueue<Integer> maxHeap = new PriorityQueue<>((o1, o2) -> o2 - o1);

  private boolean isEven = true;

  public void Insert(Integer num) {
    if (isEven) {
      maxHeap.offer(num);

      int max = maxHeap.poll();
      minHeap.offer(max);
    } else {
      minHeap.offer(num);

      int min = minHeap.poll();
      maxHeap.offer(min);
    }
    isEven = !isEven;
  }

  public Double GetMedian() {
    if (isEven) return (double) (minHeap.peek() + maxHeap.peek()) / 2;
    return (double) minHeap.peek();
  }
}
