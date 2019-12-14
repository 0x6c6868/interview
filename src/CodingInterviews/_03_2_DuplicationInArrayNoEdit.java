package CodingInterviews;

public class _03_2_DuplicationInArrayNoEdit {

  public boolean duplicate(int numbers[], int length, int[] duplication) {
    if (numbers == null || length == 0) return false;

    int start = 1;
    int end = length - 1;

    while (start <= end) {
      int mid = start + (end - start) / 2;

      int count = 0;
      for (int i = 0; i < length; i++) {
        if (numbers[i] >= start && numbers[i] <= mid) count++;
      }

      if (start == end && count > 1) {
        duplication[0] = start;
        return true;
      }

      if (count > (mid - start + 1)) end = mid;
      else start = mid + 1;
    }
    return false;
  }

  public static void test1() {
    _03_2_DuplicationInArrayNoEdit p = new _03_2_DuplicationInArrayNoEdit();
    int duplication[] = new int[1];
    p.duplicate(new int[] {2, 3, 5, 4, 3, 2, 6, 7}, 8, duplication);
    System.out.println(duplication[0] == 2 || duplication[0] == 3);
  }

  public static void test2() {
    _03_2_DuplicationInArrayNoEdit p = new _03_2_DuplicationInArrayNoEdit();
    int duplication[] = new int[1];
    p.duplicate(new int[] {3, 2, 1, 4, 4, 5, 6, 7}, 8, duplication);
    System.out.println(duplication[0] == 4);
  }

  public static void test3() {
    _03_2_DuplicationInArrayNoEdit p = new _03_2_DuplicationInArrayNoEdit();
    int duplication[] = new int[1];
    p.duplicate(new int[] {1, 2, 3, 4, 5, 6, 7, 1, 8}, 9, duplication);
    System.out.println(duplication[0] == 1);
  }

  public static void test4() {
    _03_2_DuplicationInArrayNoEdit p = new _03_2_DuplicationInArrayNoEdit();
    int duplication[] = new int[1];
    p.duplicate(new int[] {1, 7, 3, 4, 5, 6, 8, 2, 8}, 9, duplication);
    System.out.println(duplication[0] == 8);
  }

  public static void test5() {
    _03_2_DuplicationInArrayNoEdit p = new _03_2_DuplicationInArrayNoEdit();
    int duplication[] = new int[1];
    p.duplicate(new int[] {1, 1}, 2, duplication);
    System.out.println(duplication[0] == 1);
  }

  public static void test6() {
    _03_2_DuplicationInArrayNoEdit p = new _03_2_DuplicationInArrayNoEdit();
    int duplication[] = new int[1];
    p.duplicate(new int[] {3, 2, 1, 3, 4, 5, 6, 7}, 8, duplication);
    System.out.println(duplication[0] == 3);
  }

  public static void test7() {
    _03_2_DuplicationInArrayNoEdit p = new _03_2_DuplicationInArrayNoEdit();
    int duplication[] = new int[1];
    p.duplicate(new int[] {1, 2, 2, 6, 4, 5, 6}, 7, duplication);
    System.out.println(duplication[0] == 2 || duplication[0] == 6);
  }

  public static void test8() {
    _03_2_DuplicationInArrayNoEdit p = new _03_2_DuplicationInArrayNoEdit();
    int duplication[] = new int[1];
    p.duplicate(new int[] {1, 2, 2, 6, 4, 5, 2}, 7, duplication);
    System.out.println(duplication[0] == 2);
  }

  public static void test9() {
    _03_2_DuplicationInArrayNoEdit p = new _03_2_DuplicationInArrayNoEdit();
    int duplication[] = new int[1];
    p.duplicate(new int[] {1, 2, 6, 4, 5, 3}, 6, duplication);
    System.out.println(duplication[0] == 0);
  }

  public static void test10() {
    _03_2_DuplicationInArrayNoEdit p = new _03_2_DuplicationInArrayNoEdit();
    int duplication[] = new int[1];
    p.duplicate(null, 0, duplication);
    System.out.println(duplication[0] == 0);
  }

  public static void main(String[] args) {
    test1();
    test2();
    test3();
    test4();
    test5();
    test6();
    test7();
    test8();
    test9();
    test10();
  }
}
