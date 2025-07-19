class Solution {
    public List<String> removeSubfolders(String[] folder) {
        ArrayList<String> ans = new ArrayList<>();
        Arrays.sort(folder);
        int i=0;
        ans.add(folder[i++]);
        String prev=folder[0];
        while(i < folder.length){
            String curr=folder[i];
            if(!curr.startsWith(prev+'/')){
                prev = folder[i];
                ans.add(prev);
            }
            i++;
        }
        return ans;
    }
}