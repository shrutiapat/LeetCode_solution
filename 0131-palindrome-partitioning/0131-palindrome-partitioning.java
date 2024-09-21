class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> list = new ArrayList<>();
        partitionUtil(s, 0 ,new ArrayList<String>(), list);
        return list;
    }

    void partitionUtil(String s, int index, ArrayList<String> tempList, List<List<String>> list){
        if (index >= s.length()) {
            list.add(new ArrayList<>(tempList));
        }

        for (int i=index+1;i<=s.length();i++)
        {
            String tempString = s.substring(index, i);
            if (palidrone(tempString)) {
                tempList.add(tempString);
                partitionUtil(s, i, tempList, list);
                tempList.remove(tempList.size()-1);
            }
        }
    }

    boolean palidrone(String s){
        int index = 0 ;
        while (index < s.length()/2)
        {
            if (s.charAt(index) != s.charAt(s.length()-index-1)) return false;
            index++;
        }
        return true;
    }
}