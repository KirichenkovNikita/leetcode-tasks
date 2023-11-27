package topinterview150;

import java.util.HashSet;

public class RemoveDuplicatesFromSortedArray_26 {
    public static int removeDuplicates(int[] nums) {
        HashSet<Integer> result = new HashSet<>();
        var index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (!result.contains(nums[i])) {
                nums[index++] = nums[i];
                result.add(nums[i]);
            }
        }

        return result.size();
//        Best solution
//        int j = 1;
//        for (int i = 1; i < nums.length; i++) {
//            if (nums[i] != nums[i - 1]) {
//                nums[j] = nums[i];
//                j++;
//            }
//        }
//        return j;
    }
}
