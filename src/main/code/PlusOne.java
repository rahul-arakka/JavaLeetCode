//https://leetcode.com/problems/plus-one/?envType=problem-list-v2&envId=math

class Solution {
    public int[] plusOne(int[] d) {
        int len = d.length;
        boolean flag = false;
        for(int i=len-1;i>=0;i--){
            if(d[i] != 9){
                flag = true;
                d[i]++;
                break;
            }
            else    d[i] = 0;
        }
        if(!flag){
            int[] ans = new int[len+1];
            ans[0] = 1;
            for(int j=1;j<=len;j++){
                ans[j] = d[j-1];
            }
            d = ans;
        }
        return d;
    }
}