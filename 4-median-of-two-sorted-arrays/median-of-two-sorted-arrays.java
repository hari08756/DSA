class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int n3 = n1 + n2;
        int [] nums3 = new int[n3];
        int i = 0;
        int j = 0;
        for(int k = 0; k<n3; k++){
            if(i<n1 && j<n2){
                if(nums1[i]<nums2[j]){
                    nums3[k] = nums1[i];
                    i++;
                }
                else{
                    nums3[k] = nums2[j];
                    j++;
                    
                }
            }
            else if(i<n1){
                nums3[k] = nums1[i];
                i++;
            }
            else if(j<n2){
                nums3[k] = nums2[j];
                j++;
            }
        }
        if(n3%2==0) return (nums3[n3/2-1] + nums3[n3/2])/2.0;
        else return nums3[n3/2] ;
        
    }
}