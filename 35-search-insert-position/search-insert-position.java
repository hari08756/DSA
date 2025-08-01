class Solution {
    public int searchInsert(int[] nums, int target) {
        int n= nums.length;
        int k =0;
        for(int i=0; i<n;i++){
                    if(nums[i]==target){
                        k= i;
                        break;
                    }
                    else if(nums[i]>target){ 
                        k = i;
                        break;
                    }
                    else k = n;
        }
        return k;
    }
}