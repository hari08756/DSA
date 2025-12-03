class Solution {
    public void duplicateZeros(int[] arr) {
        int n = arr.length;
        int [] nums = new int [n];
        for(int i = 0, k = 0; i<n; i++){
            if(k >= n) break;
            if(arr[i] != 0){
                nums[k++] = arr[i];
            }else{
                nums[k] = 0;
                if(k >= n-1) break;
                nums[k+1] = 0;
                k += 2;
            }
        }
        for(int i = 0; i<n; i++){
            arr[i] = nums[i];
        }
    }
}