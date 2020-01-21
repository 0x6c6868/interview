package CodingInterviews;

public class _53_3_IntegerIdenticalToIndex {

  public int GetNumberSameAsIndex(int[] array) {
    if (array == null || array.length == 0) return -1;

    int start = 0;
    int end = array.length - 1;
    while (start <= end) {
      int mid = (end - start) / 2 + start;
      if (array[mid] == mid) return mid;
      if (array[mid] > mid) end = mid - 1;
      else start = mid + 1;
    }

    return -1;
  }

  public static void main(String[] args) {
    _53_3_IntegerIdenticalToIndex p = new _53_3_IntegerIdenticalToIndex();
    int[] array;

    array = new int[] {-3, -1, 1, 3, 5};
    System.out.println(p.GetNumberSameAsIndex(array) == 3 ? "Passed" : "Failed");

    array = new int[] {0, 1, 3, 5, 6};
    System.out.println(p.GetNumberSameAsIndex(array) == 0 ? "Passed" : "Failed");

    array = new int[] {-1, 0, 1, 2, 4};
    System.out.println(p.GetNumberSameAsIndex(array) == 4 ? "Passed" : "Failed");

    array = new int[] {-1, 0, 1, 2, 5};
    System.out.println(p.GetNumberSameAsIndex(array) == -1 ? "Passed" : "Failed");

    array = new int[] {0};
    System.out.println(p.GetNumberSameAsIndex(array) == 0 ? "Passed" : "Failed");

    array = new int[] {10};
    System.out.println(p.GetNumberSameAsIndex(array) == -1 ? "Passed" : "Failed");

    array = null;
    System.out.println(p.GetNumberSameAsIndex(array) == -1 ? "Passed" : "Failed");
  }
}
