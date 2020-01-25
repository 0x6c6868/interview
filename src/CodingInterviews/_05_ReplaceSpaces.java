package CodingInterviews;

// 替换空格
public class _05_ReplaceSpaces {

  public String replaceSpace(StringBuffer str) {
    if (str == null || str.length() == 0) return "";

    char[] array = str.toString().toCharArray();

    int countOfSpace = 0;
    for (int i = 0; i < array.length; i++) if (array[i] == ' ') countOfSpace++;

    char[] newArray = new char[array.length + 2 * countOfSpace];

    int i = array.length - 1;
    int j = newArray.length - 1;

    while (i >= 0) {
      if (array[i] == ' ') {
        newArray[j] = '0';
        newArray[j - 1] = '2';
        newArray[j - 2] = '%';
        j -= 2;
      } else {
        newArray[j] = array[i];
      }
      i--;
      j--;
    }

    return String.valueOf(newArray);
  }
}
