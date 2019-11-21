package CodingInterviews;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _50_2_FirstCharacterInStream {

    private Map<Character, Integer> charCount = new HashMap<>();

    private List<Character> data = new ArrayList<>();

    public void Insert(char ch) {
        charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
        data.add(ch);
    }

    public char FirstAppearingOnce() {
        for (Character ch : data) {
            if (charCount.get(ch) == 1) return ch;
        }
        return '#';
    }

}
