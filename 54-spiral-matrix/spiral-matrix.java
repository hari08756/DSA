class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;
        int top = 0, bottom = m-1;
        int left = 0, right = n-1;
        while(top <= bottom && left <= right){
            // left to right
            for(int j = left; j<= right; j++){
                list.add(matrix[top][j]);
            }
            top++;
            // top to bottom
            for(int i = top; i<=bottom; i++){
                list.add(matrix[i][right]);
            }
            right--;
            //right to left
            if(top<=bottom){
                for(int j = right; j>= left; j--){
                    list.add(matrix[bottom][j]);
                }
                bottom--;
            }
            // bottom to top
            if(left<= right){
                for(int i = bottom; i>= top; i--){
                    list.add(matrix[i][left]);
                }
                left++;
            }
        }
        return list;
    }
}