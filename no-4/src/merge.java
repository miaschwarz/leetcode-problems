public class merge {
    public static void main(String[] args) {
        int[] nums1 = {1, 3};
        int[] nums2 = {2};
        findMedianSortedArrays(nums1, nums2);

    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len = nums1.length + nums2.length;
        int[] merged = new int[len];
        int nums1index = 0;
        int nums2index = 0;
        for (int i = 0; i < len; i++) {
            if (nums2index >= nums2.length || (nums1index < nums1.length && nums1[nums1index] < nums2[nums2index])) {
                merged[i] = nums1[nums1index];
                nums1index++;
            } else {
                merged[i] = nums2[nums2index];
                nums2index++;
            }
        }

        double median = 0;
        if (len % 2 == 0)  {
            int middle = (len / 2) - 1;
            int x = merged[middle] + merged[middle + 1];
            median = x / 2.0;
        } else {
            median = merged[len / 2] ;
        }
        return median;
    }
}
