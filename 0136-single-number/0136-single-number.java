class Solution {
    public int singleNumber(int[] nums) {
        //variable store
        int single = nums[0];

        //loop tto check all elements
        for(int i=1; i<nums.length; i++ ){
            single = single ^ nums[i];
        }
        return single;

    }
}