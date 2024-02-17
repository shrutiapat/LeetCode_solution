class Solution {
    public int getLucky(String s, int k) {
        String n = "";
        int num = 0;
        for(int i=0; i<s.length(); i++) n += s.charAt(i)-'a'+1 + "";
        while(k-- > 0){
            num = 0;
            for(char c: n.toCharArray()){
                num += Integer.parseInt(c + "");
            }
            n = String.valueOf(num);
        }
        return num;
    }
}