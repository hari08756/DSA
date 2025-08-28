class Solution {
    public boolean exist(char[][] board, String word) {
        if (board == null || word == null) return false;
        
        int rows = board.length;
        int cols = board[0].length;
        
        // Iterate through each cell in the board
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                // Start DFS from this cell if the first character matches
                if (board[i][j] == word.charAt(0) && 
                    dfs(board, i, j, word, 0)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    private boolean dfs(char[][] board, int i, int j, String word, int index) {
        // If we've matched all characters in the word
        if (index == word.length()) {
            return true;
        }
        
        // Check for out of bounds or mismatch
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || 
            board[i][j] != word.charAt(index)) {
            return false;
        }
        
        // Mark the cell as visited by temporarily changing its value
        char temp = board[i][j];
        board[i][j] = '#';
        
        // Check all four directions
        boolean found = dfs(board, i + 1, j, word, index + 1) || // down
                       dfs(board, i - 1, j, word, index + 1) || // up
                       dfs(board, i, j + 1, word, index + 1) || // right
                       dfs(board, i, j - 1, word, index + 1);   // left
        
        // Restore the original value
        board[i][j] = temp;
        
        return found;
    }
}