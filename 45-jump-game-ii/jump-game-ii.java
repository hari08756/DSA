class Solution {
    public int jump(int[] nums) {
        int jump = 0;
        int current = 0;
        int next = 0;
        for(int i = 0; i<nums.length-1; i++){
            current = Math.max(current,i+nums[i]);
            if(i == next){
                jump++;
                next = current;
            }
        }
        return jump;
    }
}