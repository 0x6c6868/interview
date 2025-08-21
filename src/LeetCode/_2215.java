package LeetCode;

import java.util.*;
import java.util.stream.Collectors;

public class _2215 {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {

        Set<Integer> set1 = Arrays.stream(nums1).boxed().collect(Collectors.toSet());
        Set<Integer> set2 = Arrays.stream(nums2).boxed().collect(Collectors.toSet());

        List<Integer> rst1 = set1.stream()
                .filter(e -> !set2.contains(e))
                .collect(Collectors.toList());
        List<Integer> rst2 = set2.stream()
                .filter(e -> !set1.contains(e))
                .collect(Collectors.toList());

        List<List<Integer>> rst = new ArrayList<>();
        rst.add(rst1);
        rst.add(rst2);

        return rst;
    }

    public static void main(String[] args) {
        System.out.println(new _2215().findDifference(new int[]{1, 2, 3}, new int[]{3, 4, 5}));
    }
}
