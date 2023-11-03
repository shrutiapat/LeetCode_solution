class Solution {
  public int[] twoSum(int[] nums, int target) {
    Map<Integer, Integer> index = new HashMap<>();

    for (int i = 0; i < nums.length; i++) { 
        int other = target -nums[i];
        if (index.containsKey(other)){
            return new int[] {index.get(other), i};
        }
        index.put(nums[i], i);
    }

    throw new IllegalArgumentException();
  }
}
