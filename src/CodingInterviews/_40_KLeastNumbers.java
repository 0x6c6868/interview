package CodingInterviews;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

// 最小的K个数
public class _40_KLeastNumbers {

  private PriorityQueue<Integer> maxHeap = new PriorityQueue<>((o1, o2) -> o2 - o1);

  public ArrayList<Integer> GetLeastNumbers_Solution(int[] array, int k) {
    if (array == null || array.length == 0 || k == 0 || k > array.length) return new ArrayList<>();

    for (int i = 0; i < array.length; i++) {
      if (maxHeap.size() < k) maxHeap.offer(array[i]);
      else {
        Integer max = maxHeap.peek();
        if (array[i] > max) continue;

        maxHeap.poll();
        maxHeap.offer(array[i]);
      }
    }

    return (ArrayList) maxHeap.stream().collect(Collectors.toList());
  }
}
