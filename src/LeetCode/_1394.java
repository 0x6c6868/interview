package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class _1394 {

    public int findLucky(int[] arr) {
        if (arr == null || arr.length == 0) {
            return -1;
        }

        HashMap<Integer, Integer> m = new HashMap<>();
        for (int i : arr) {
            if (!m.containsKey(i)) {
                m.put(i, 1);
            } else {
                m.put(i, m.get(i) + 1);
            }
        }

        int rst = -1;
        int count = Integer.MIN_VALUE;
        for (Map.Entry<Integer, Integer> entry : m.entrySet()) {
            Integer k = entry.getKey();
            Integer v = entry.getValue();

            if (!k.equals(v)) {
                continue;
            }

            if ((v > count) || (v.equals(count) && k.equals(rst))) {
                rst = k;
                count = v;
            }
        }
        return rst;
    }

    public static void main(String[] args) {
        System.out.println(new _1394().findLucky(new int[]{2, 2, 3, 4}));
        System.out.println(new _1394().findLucky(new int[]{1, 2, 2, 3, 3, 3}));
        System.out.println(new _1394().findLucky(new int[]{2, 2, 2, 3, 3}));
        System.out.println(new _1394().findLucky(new int[]{5}));
        System.out.println(new _1394().findLucky(new int[]{7, 7, 7, 7, 7, 7, 7}));
    }
}
