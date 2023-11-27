package topinterview150;

public class RemoveDuplicatesFromSortedArrayII_80 {
    public static int removeDuplicates(int[] nums) {
        var j = 2;
        var numsCopy = nums.clone();
        for (int i = 2; i < nums.length; i++) {
            if (numsCopy[i] != numsCopy[i-1] || numsCopy[i] != numsCopy[i-2]) {
                nums[j++] = nums[i];
            }
        }

        return j;
    }
}
