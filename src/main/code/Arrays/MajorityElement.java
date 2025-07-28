//https://leetcode.com/problems/majority-element/?envType=problem-list-v2&envId=array

class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int i=1, count = 1, prevC = 0, ans = nums[0];
        for(i =1;i<nums.length;i++){
            if(nums[i] != nums[i-1] && count>prevC){
                ans = nums[i-1];
                prevC = count;
                count = 1;
            }else   count++;
        }
        if(count>prevC)
            ans = nums[i-1];
        return ans;
    }
}