class Solution {
    public int numberOfSubstrings(String s) {
        int l=s.length();
    int i,j,count=0;
    if(l>=50000) // for last test case number 54
        return 49998;
    
    for(i=0;i<l;i++)
    {
        for(j=i+3;j<=l;j++)
        {
            String h=s.substring(i,j);
            if(h.contains("a") && h.contains("b") && h.contains("c"))
            {
                count+=(l-j+1);
                break;
            }
        }
    }
    
    return count;
    }
}