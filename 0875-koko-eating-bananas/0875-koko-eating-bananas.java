class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
		int right = Arrays.stream(piles).max().getAsInt();
		int ans = right;
		
		while(left <= right){
			int k = (right + left) / 2;
			
			double eatH = 0;
			
			for(int i = 0; i < piles.length; i++)
				eatH = eatH + (piles[i] + k - 1) / k;
			
			if(eatH > h){
				left = k + 1;
			}else{
				ans = Math.min(ans, k);
				right = k - 1;
			}
		}
		System.gc();
		return ans;
    }
}