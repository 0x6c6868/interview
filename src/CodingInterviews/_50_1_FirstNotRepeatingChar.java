package CodingInterviews;

public class _50_1_FirstNotRepeatingChar {

  public int FirstNotRepeatingChar(String str) {
    int[] counts = new int[58];
    for (int i = 0; i < str.length(); i++) counts[str.charAt(i) - 'A'] += 1;
    for (int i = 0; i < str.length(); i++) if (counts[str.charAt(i) - 'A'] == 1) return i;
    return -1;
  }
}
