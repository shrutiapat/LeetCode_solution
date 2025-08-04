class Solution {
    public int totalFruit(int[] arr) {
        int n = arr.length,i=0,j=0,maxLen = 0;
        Map<Integer,Integer> map = new HashMap<>();
        while(j<n)
        {
            if(map.containsKey(arr[j]))//map m element hai to freqency bda do uski
            {
              int freq = map.get(arr[j]);
              map.put(arr[j],freq+1);
            }
            else//map m phle s element nhi h
            {
                map.put(arr[j],1);
            }

            //checking if map has 2 s zada elements
            while(map.size()>2)
            {//remove kro elements kro tbtk 2 distnict element map m nhi reh jate
                int freq = map.get(arr[i]);
                if(freq==1) map.remove(arr[i]);
                else map.put(arr[i],freq-1);//freq greater than 1 so decrease freq
                i++;
            }

            //finding length
            int len = j-i+1;
             maxLen=Math.max(maxLen,len);
            j++;
        }

        return maxLen;
    }
}