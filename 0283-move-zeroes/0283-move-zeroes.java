class Solution {
  public void moveZeroes(int[] nums) {
      //start with the first position
    int first = 0;

    for (int i = 0; i < nums.length; i++){
        //fill all non-zero numbers
        if (nums[i] != 0){
            nums[first] = nums[i];
            first++;
        }

    }
    while (first < nums.length){
        nums[first++] = 0;
    }
  }
}
