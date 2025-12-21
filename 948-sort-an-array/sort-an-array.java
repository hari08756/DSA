class Solution {
    private void mergeSort(int [] a, int l, int r, int [] temp){
        if(l >= r) return;
        int mid = l + (r-l)/2;
        mergeSort(a,l,mid,temp);
        mergeSort(a, mid+1, r, temp);
        merge(a, l, mid, r, temp);
    }
    private void merge(int [] a, int l, int mid, int r, int [] temp){
        int i = l;
        int j = mid + 1;
        int k = l;
        while(i <= mid && j <= r){
            if(a[i] <= a[j]){
                temp[k++] = a[i++];
            }else{
                temp[k++] = a[j++];
            }
        }
        while(i <= mid){
            temp[k++] = a[i++];
        }
        while(j <= r){
            temp[k++] = a[j++];
        }
        for(int idx = l; idx <= r; idx++){
            a[idx] = temp[idx];
        }
    }
    public int[] sortArray(int[] nums) {
        int n = nums.length;
        int [] temp = new int [n];
        mergeSort(nums, 0, n-1, temp);
        return nums;
    }
}