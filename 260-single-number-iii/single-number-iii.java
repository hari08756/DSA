import java.util.*;

class Solution {
    public int[] singleNumber(int[] nums) {
        int n = nums.length;
        ArrayList<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0; i < n; i++){
            if(i == n-1){
                list.add(nums[i]);
            } else if(nums[i] == nums[i+1]){
                i++;
            } else {
                list.add(nums[i]);
            }
        }
        
        // Convert ArrayList<Integer> to int[]
        int[] result = new int[list.size()];
        for(int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }
}
