class Solution {
  public int[] intersect(int[] nums1, int[] nums2) {
    if (nums1.length > nums2.length) {
            return intersect(nums2, nums1);
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : nums1) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        List<Integer> list = new ArrayList<>();
        for (int n : nums2) {
            int count = map.getOrDefault(n, 0);
            if (count > 0) {
                list.add(n);
                map.put(n, count - 1);
            }
        }
        int[] result = new int[list.size()];
        int i = 0;
        for (int n : list) {
            result[i++] = n;
        }
        return result;
    }
}