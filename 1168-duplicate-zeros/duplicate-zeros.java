class Solution {
    public void duplicateZeros(int[] arr) {
        int n = arr.length;
        for(int left = 0; left<n; left++){
            int right = n-1;
            if(arr[left] == 0){
                while(left<right){
                    arr[right--] = arr[right];
                }
                arr[left++] = 0;
            }
        }
    }
}