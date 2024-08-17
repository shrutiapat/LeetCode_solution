class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for(int num: nums){
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0)+1);
        }
        PriorityQueue<Map.Entry<Integer, Integer>> minHeap = new PriorityQueue<>(
            (a,b)-> a.getValue() - b.getValue()
        );

        for(Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()){
            minHeap.add(entry);
            if (minHeap.size() > k) {
                minHeap.poll(); 
            }
        }
        int res[] = new int[k];
        for(int i = k-1 ; i >= 0; i--){
            res[i] = minHeap.poll().getKey();
        }
        return res;
    }
}