package CodingInterviews;

public class _03_1_DuplicationInArray {

  public boolean duplicate(int numbers[], int length, int[] duplication) {
    if (numbers == null || length == 0) return false;

    for (int i = 0; i < length; ) {
      if (i == numbers[i]) {
        i++;
        continue;
      }

      int swap = numbers[i];
      if (numbers[swap] == swap) {
        duplication[0] = swap;
        return true;
      }

      numbers[i] = numbers[swap];
      numbers[swap] = swap;
    }
    return false;
  }
}
