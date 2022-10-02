
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {

    public static int[] twoSum(int[] nums, int target) {
        if( nums == null || nums.length < 2) return null;
        Map<Integer,Integer> idxByValue = new HashMap<>();
        for (int i = 0; i < nums.length; i++ ){
            int curr = target - nums[i];

            if(idxByValue.get(curr)!= null){
                return new int[]{i,idxByValue.get(curr)};
            }
            idxByValue.put(nums[i], i);
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{2, 11, 7, 15}, 17)));
    }
}
