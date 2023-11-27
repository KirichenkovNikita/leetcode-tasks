package topinterview150;

public class MergeSortedArray_88 {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int size = m+n;
        int nums1Count = 0;
        int nums2Count = 0;
        int[] nums1Copy = nums1.clone();
        for (int i = 0; i < size; i++) {
            if (nums1Count == m) {
                nums1[i] = nums2[nums2Count++];
            } else if (nums2Count == n) {
                nums1[i] = nums1Copy[nums1Count++];
            } else if (nums2[nums2Count] > nums1Copy[nums1Count]) {
                nums1[i] = nums1Copy[nums1Count++];
            } else {
                nums1[i] = nums2[nums2Count++];
            }
        }

        // Solution Two Pointer
        // Time complexity: O(m+n)
        // Space complexity: O(1)
//        int i = m - 1;
//        int j = n - 1;
//        int k = m + n - 1;
//
//        while (j >= 0) {
//            if (i >= 0 && nums1[i] > nums2[j]) {
//                nums1[k--] = nums1[i--];
//            } else {
//                nums1[k--] = nums2[j--];
//            }
//        }


        // Solution Using STL
        // Time complexity: O((m+n)log(m+n))
        // Space complexity: O(1)
//        int i = m - 1;
//        int j = n - 1;
//        int k = m + n - 1;
//
//        for (int j = 0, i = m; j < n; j++) {
//            nums1[i] = nums2[j];
//            i++;
//        }
//        Arrays.sort(nums1);
    }
}
