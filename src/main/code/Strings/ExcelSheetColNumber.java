//https://leetcode.com/problems/excel-sheet-column-number/?envType=problem-list-v2&envId=string

class Solution {
    public int titleToNumber(String col) {
        int ans = 0;
        for(int i=0;i<col.length();i++){
            ans = (ans*26)+(col.charAt(i)%64);
        }
        return ans;
    }
}