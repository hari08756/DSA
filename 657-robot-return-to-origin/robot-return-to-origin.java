class Solution {
    public boolean judgeCircle(String moves) {
        int[] position = new int[2]; // [x, y]
        
        for (char move : moves.toCharArray()) {
            if (move == 'U') position[1]++;
            else if (move == 'D') position[1]--;
            else if (move == 'R') position[0]++;
            else if (move == 'L') position[0]--;
        }
        
        return position[0] == 0 && position[1] == 0;
    }
}