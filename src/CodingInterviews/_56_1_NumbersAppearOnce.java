package CodingInterviews;

// 数组中只出现一次的数字
public class _56_1_NumbersAppearOnce {

  public void FindNumsAppearOnce(int[] array, int num1[], int num2[]) {
    if (array == null || array.length == 0) return;

    int xor = 0;
    for (int i = 0; i < array.length; i++) xor ^= array[i];

    int indexBit = 0;
    while ((xor & 1 << indexBit) == 0) indexBit++;

    int numOne = 0;
    int numTwo = 0;
    for (int i = 0; i < array.length; i++)
      if ((1 << indexBit & array[i]) == 0) numOne ^= array[i];
      else numTwo ^= array[i];

    num1[0] = numOne;
    num2[0] = numTwo;
  }
}
