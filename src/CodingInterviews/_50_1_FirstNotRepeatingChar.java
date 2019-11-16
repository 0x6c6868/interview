package CodingInterviews;

import java.util.HashMap;
import java.util.Map;

public class _50_1_FirstNotRepeatingChar {

    public int FirstNotRepeatingChar(String str) {
        if (str == null || str.length() == 0) return -1;

        Map<Character, Integer> map = new HashMap();
        for (int i = 0; i < str.length(); i++) {
            Character currChar = str.charAt(i);
            map.put(currChar, map.getOrDefault(currChar, 0) + 1);
        }

        for (int i = 0; i < str.length(); i++) {
            Character currChar = str.charAt(i);
            if (map.get(currChar) == 1)
                return i;
        }

        return -1;
    }

}
