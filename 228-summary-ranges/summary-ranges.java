class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        if(nums.length == 0) return result;
        int n = nums.length;
        int i = 0;

        while(i<n){
            int start = nums[i];
            while(i<n-1 && nums[i] +1 == nums[i+1]){
             i++;
            }
            int end = nums[i];
            if(start == end) result.add(String.valueOf(start));
            else result.add(start +"->"+ end);

            i++;
        }
        return result;
    }
}