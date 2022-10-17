import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Threesum {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result= new ArrayList<>();
        Arrays.sort(nums);
        for (int k=0;k<nums.length;k++){
            int n=nums[k];
            int i=1, j=nums.length-1;
            List<Integer> res=new ArrayList<>();
            while(i < j&& n!= nums[i]&&n!= nums[j]){
                if((nums[i]+nums[j])==-n) {
                    res.add(nums[k]);
                    res.add(nums[i]);
                    res.add(nums[j]);
                    result.add(res);
                }
                if((nums[i]+nums[j]>n)) j--;
                if((nums[i]+nums[j])<n) i++;
            }
        }
        
        return result;
    }
    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        System.out.println(threeSum(nums));
    }
}
