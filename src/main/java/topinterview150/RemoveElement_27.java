package topinterview150;

public class RemoveElement_27 {
    public static int removeElement(int[] nums, int val) {
        int j = 0;
        int[] numsCopy = nums.clone();
        for (int k : numsCopy) {
            if (k != val) {
                nums[j++] = k;
            }
        }

        return j;
    }
}
