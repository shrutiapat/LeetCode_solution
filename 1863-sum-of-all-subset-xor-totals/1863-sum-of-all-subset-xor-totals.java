class Solution {
    public int subsetXORSum(int[] nums) {
        return helper(nums, 0, 0);
    }
    
    private int helper(int[] nums, int index, int currentXor) {
        if (index == nums.length) return currentXor;
        
        int withElement = helper(nums, index + 1, currentXor ^ nums[index]);
        
        int withoutElement = helper(nums, index + 1, currentXor);
        
        return withElement + withoutElement;
    }
}