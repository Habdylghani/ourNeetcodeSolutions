import java.util.*;

class ContainDuplicate {
    public static boolean containDuplicate(int[] nums) {
        HashSet<Integer> mySet = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (!mySet.add(nums[i]))
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 1, 2, 2, 5, 4, 8 };
        System.out.println(containDuplicate(arr));
    }

}