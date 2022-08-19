import java.util.*;

public class TwoSums {
    public static int[] twoSum(int[] nums, int target) {
        int[] sol = { 0, 0 };
        stop: for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (target == nums[i] + nums[j]) {
                    sol[0] = i;
                    sol[1] = j;
                    break stop;
                }
            }
        }
        return sol;
    }

    public static int[] twoSum2(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] sol = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                sol[0] = map.get(target - nums[i]);
                sol[1] = i;
                break;
            }
            map.put(nums[i], i);
        }
        return sol;
    }

    public static void main(String[] args) {
        int[] nums = { 3, 2, 4 };
        int target = 6;
        System.out.println(Arrays.toString(twoSum(nums, target)));
        System.out.println(Arrays.toString(twoSum2(nums, target)));
    }
}
