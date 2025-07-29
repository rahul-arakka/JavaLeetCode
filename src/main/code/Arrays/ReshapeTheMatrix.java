//https://leetcode.com/problems/reshape-the-matrix/description/?envType=problem-list-v2&envId=array
class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int row = mat.length, col = mat[0].length;
        if((row*col) != (r*c))
            return mat;
        int x=0,y=0;
        int[][] ans = new int[r][c];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                ans[x][y] = mat[i][j];
                if((y+1)<c) y++;
                else{
                    y = 0;
                    x++;
                }
            }
        }
        return ans;
    }
}