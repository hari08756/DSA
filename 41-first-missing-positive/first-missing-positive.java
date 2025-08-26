class Solution {
    public int firstMissingPositive(int[] nums) {
        int missno = 1;
        int n = nums.length;
        Arrays.sort(nums);
        for(int i = 0; i<n; i++){
            if(missno==nums[i]){
                missno++;
            }
        }
        return missno;
    }
}