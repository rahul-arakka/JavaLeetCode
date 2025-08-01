//https://leetcode.com/problems/range-sum-query-immutable/description/?envType=problem-list-v2&envId=array

//class NumArray {
//    int arr[];
//    public NumArray(int[] nums) {
//        this.arr = nums;
//    }
//
//    public int sumRange(int left, int right) {
//        int sum = 0;
//        for(int i=left;i<=right;i++){
//            sum += arr[i];
//        }
//        return sum;
//    }
//}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */

//Approach 2
class NumArray {
    int arr[];
    public NumArray(int[] nums) {
        this.arr = nums;
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            arr[i] += sum;
            sum = arr[i];
        }
    }

    public int sumRange(int left, int right) {
        return left!=0 ? arr[right]-arr[left-1] :arr[right] ;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */