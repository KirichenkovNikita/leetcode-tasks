package topinterview150;

public class MajorityElement_169 {
    public static int majorityElement(int[] nums) {
        var num = 0;
        var count = 0;

        for (int j : nums) {
            if (count == 0) {
                num = j;
            }

            if (j == num) {
                count++;
            } else {
                count--;
            }
        }

        return num;
    }
}
