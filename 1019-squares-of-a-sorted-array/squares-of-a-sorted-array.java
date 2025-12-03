class Solution {
    public int[] sortedSquares(int[] nums) {
        int left = 0; 
        int right = nums.length -1;
        int pos = nums.length -1;
        int [] result = new int[nums.length]; 
        while(left <= right){
            int leftSquare = nums[left] * nums[left];
            int rightSquare = nums[right] * nums[right];
            if(leftSquare < rightSquare){
                result[pos] = rightSquare;
                right--;
            }else{
                result[pos] = leftSquare;
                left++;
            }
            pos--;
        }
        return result;
    }
}