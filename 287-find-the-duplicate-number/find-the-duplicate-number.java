import java.util.Arrays;
class Solution {
    public int findDuplicate(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int dupno = 0;
        for(int i = 0; i<n-1; i++){
                if(nums[i]==nums[i+1]){
                    dupno = nums[i];
                    break;
                }
        }
        return dupno;
    }
}