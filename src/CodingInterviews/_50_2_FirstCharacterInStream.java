package CodingInterviews;

import java.util.ArrayList;
import java.util.List;

// 字符流中第一个不重复的字符
public class _50_2_FirstCharacterInStream {

  private List<Character> data = new ArrayList<>();
  int[] counts = new int[128];

  public void Insert(char ch) {
    counts[ch]++;
    data.add(ch);
  }

  public char FirstAppearingOnce() {
    for (Character ch : data) if (counts[ch] == 1) return ch;
    return '#';
  }
}
