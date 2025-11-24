class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> ans = new ArrayList<>();
        int reminder = 0;
        for(int i = 0; i<nums.length; i++){
reminder = (reminder * 2 + nums[i]) % 5;            if(reminder % 5 == 0){
                ans.add(true);
            }
            else{
                ans.add(false);
            }
        }
        return ans;
    }
}