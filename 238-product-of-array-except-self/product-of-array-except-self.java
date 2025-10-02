class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int [] output = new int[n] ;
        
            int mul = 1;
            for(int i = 0; i<n; i++){
                mul *= nums[i];
                
            }
            for(int i = 0, j = 0; i<n; i++, j++){
                if(nums[i] != 0){
                                        
                    output[i] = mul/nums[i];
                    
                }
                else{
                        output[i] = 1;
                        for(int l = 0; l<n; l++){
                            if(l !=j){
                                output[i] *= nums[l];
                            }
                        }
                    }
            }

        
        return output;
    }
}