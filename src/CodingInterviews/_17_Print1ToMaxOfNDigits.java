package CodingInterviews;

public class _17_Print1ToMaxOfNDigits {

  private char[] array;

  public void print1ToMaxOfNDigits(int n) {
    if (n <= 0) return;
    this.array = new char[n];
    printCore(0);
  }

  private void printCore(int index) {
    if (index >= array.length) {
      print();
      return;
    }

    for (char i = '0'; i <= '9'; i++) {
      array[index] = i;
      printCore(index + 1);
    }
  }

  private void print() {
    boolean needPrintZero = false;
    for (int i = 0; i < array.length; i++)
      if (array[i] != '0' || needPrintZero) {
        System.out.print(array[i]);
        needPrintZero = true;
      }
    System.out.println();
  }

  public static void main(String[] args) {
    _17_Print1ToMaxOfNDigits p = new _17_Print1ToMaxOfNDigits();
    p.print1ToMaxOfNDigits(2);
  }
}
