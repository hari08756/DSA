class Solution {
    public int[] finalPrices(int[] prices) {
        int n = prices.length;
        int [] result = new int[n];
        for(int i = 0; i<n; i++){
            result[i] = prices[i];
        }
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i<n; i++){
            while(!stack.isEmpty() && prices[i]<=prices[stack.peek()]){
                result[stack.pop()] -= prices[i];
            }
            stack.push(i);
        }
        return result;
    }
}