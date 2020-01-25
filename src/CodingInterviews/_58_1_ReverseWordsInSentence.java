package CodingInterviews;

import java.util.StringJoiner;

// 翻转单词顺序列
public class _58_1_ReverseWordsInSentence {

  public String ReverseSentence(String str) {
    if (str.trim().equals("") && str.length() > 0) return str;

    String[] temp = str.trim().split(" ");

    StringJoiner sj = new StringJoiner(" ", "", "");
    for (int i = temp.length - 1; i >= 0; i--) sj.add(temp[i]);
    return sj.toString();
  }
}
