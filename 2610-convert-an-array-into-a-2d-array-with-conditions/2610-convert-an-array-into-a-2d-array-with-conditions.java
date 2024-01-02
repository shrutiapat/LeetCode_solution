class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        
        List<List<Integer>> li = new ArrayList<>();
        
        int i = 0;
        int[] f = new int[nums.length + 1];
        for(int x : nums)
        {
            f[x]++;
        }
		
		for(int freq : f )
		{
			i = Math.max(i, freq);
		}
        for(int j  = 0 ; j < i ; j++)
        {
            li.add(new ArrayList<>());
        }
        
       for(int x : nums)
       {
            for(int j = 0 ; j < i; j++)
            {
                if(!li.get(j).contains(x))
                {
                    li.get(j).add(x);
                    break;
                }
            }
        }
        return li;
    }
}