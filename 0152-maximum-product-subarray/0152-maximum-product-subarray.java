class Solution {
    public int maxProduct(int[] nums) {
        int n= nums.length;
        int leftside = 1;
        int rightside = 1;
        int sum = nums[0];

        for(int i =0; i<n; i++){
            leftside = leftside == 0 ? 1 : leftside;
            rightside = rightside == 0 ? 1 : rightside;
            // if any product turns out to be 0 change it to 1

            leftside *= nums[i];
            rightside *= nums[n-1-i];
            
            sum = Math.max(sum, Math.max(leftside, rightside));
        }
        return sum;
    }
}