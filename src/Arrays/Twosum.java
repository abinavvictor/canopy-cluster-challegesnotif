package Arrays;

import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int [] result = new int[2];
        HashMap<Integer, Integer> numMap = new HashMap<Integer, Integer>();

        for(int i = 0; i < nums.length; i++) {
            int current = nums[i];
            int partial = target - current;
            if(numMap.containsKey(partial)){

                result [0] = Math.min(i, numMap.get(partial));
                result [1] = Math.max(i, numMap.get(partial));
            }
            numMap.put(nums[i],i);
        }
        return result;
    }
}
