class Solution {
    int binarySearch(int [] nums, int target){
        int n = nums.length;
        int l = 0;
        int h = n - 1;
        int mid = 0 ;
        while(l<=h){
            mid = l + (h - l)/2;
            if(nums[mid]==target) return mid;
            else if(nums[mid]<target) l = mid + 1;
            else h = mid - 1;
        }
        if(l<h) return mid;
        else return -1;
    }
    public int search(int[] nums, int target) {
        return binarySearch(nums, target);        
    }
}