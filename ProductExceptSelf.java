import java.util.Arrays;

public class ProductExceptSelf {
    public int[] productExceptSelf(int[] nums) {
/* 
        int n = nums.length;
        int[] prefix = new int[n];
        int[] suffix = new int[n];

        prefix[0] = nums[0];
        suffix[n - 1] = nums[n - 1];
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] * nums[i];
            suffix[n - 1 - i] = suffix[n - i] * nums[n - 1 - i];
        }
        System.out.println(Arrays.toString(prefix));
        System.out.println(Arrays.toString(suffix));

        int[] res = new int[n];
        res[0] = suffix[1];
        res[n - 1] = prefix[n - 2];
        for (int i = 1; i < n - 1; i++) {
            res[i] = prefix[i - 1] * suffix[i + 1];
        }
        return res;*/
        int[] arr = new int[nums.length];
		int right = 1, left = 1;
		for (int i = 0; i < nums.length; i++) {
			arr[i] = left;
			left *= nums[i];
		}
		for (int i = nums.length - 1; i >= 0; i--) {
			arr[i] *= right;
			right *= nums[i];
		}
		return arr;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4 };
        ProductExceptSelf p = new ProductExceptSelf();
        System.out.println(Arrays.toString(p.productExceptSelf(nums)));
    }
}
