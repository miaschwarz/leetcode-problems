import java.lang.reflect.Array;

public class doubles {
    public static void main(String[] args) {
        int[] list1 = {1, 1, 2, 2, 3};
        int[] list2 = {1, 1, 2};
        int[] list3 = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(list2));
    }

    public static int removeDuplicates(int[] nums) {
        int dest = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i == nums.length - 1 || nums[i] != nums[i + 1]) {
                nums[dest] = nums[i];
                dest++;
            }
        }
        return dest;
    }
}
