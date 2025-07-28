//https://leetcode.com/problems/single-number/?envType=problem-list-v2&envId=array

class Solution {
    public int singleNumber(int[] nums) {
        int ans=0;
        for(int i: nums){
            ans ^= i;
        }
        return ans;
    }
}