//https://leetcode.com/problems/climbing-stairs/submissions/1718688064/?envType=problem-list-v2&envId=math

class Solution {
    public int climbStairs(int n) {
        if(n<=3)    return n;
        int f = 2, s = 3;
        while(n>3){
            int t = f+s;
            f = s;
            s = t;
            n--;
        }
        return s;
    }
}