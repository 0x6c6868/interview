package CodingInterviews;

public class _53_2_MissingNumber {

    public int GetMissingNumber(int[] array) {
        if (array == null || array.length == 0) return -1;

        int start = 0;
        int end = array.length - 1;
        int mid = start;
        while (start <= end) {
            mid = (end - start) / 2 + start;
            if (array[mid] == mid) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        if (array[mid] == mid) return mid + 1;

        return mid;
    }

    public static void main(String[] args) {
        _53_2_MissingNumber p = new _53_2_MissingNumber();
        int[] array = null;

        array = new int[]{1, 2, 3, 4, 5};
        System.out.println(p.GetMissingNumber(array) == 0 ? "Passed" : "Failed");

        array = new int[]{0, 1, 2, 3, 4};
        System.out.println(p.GetMissingNumber(array) == 5 ? "Passed" : "Failed");

        array = new int[]{0, 1, 2, 4, 5};
        System.out.println(p.GetMissingNumber(array) == 3 ? "Passed" : "Failed");

        array = new int[]{1};
        System.out.println(p.GetMissingNumber(array) == 0 ? "Passed" : "Failed");

        array = new int[]{0};
        System.out.println(p.GetMissingNumber(array) == 1 ? "Passed" : "Failed");

        array = null;
        System.out.println(p.GetMissingNumber(array) == -1 ? "Passed" : "Failed");
    }

}
