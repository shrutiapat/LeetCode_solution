class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        addingpar(res, "", n, 0);
        return res;
    }
    
    private void addingpar(List<String> v, String str, int n, int m) {
        if (n == 0 && m == 0) {
            v.add(str);
            return;
        }
        if (m > 0) {
            addingpar(v, str + ")", n, m - 1);
        }
        if (n > 0) {
            addingpar(v, str + "(", n - 1, m + 1);
        }
    }
}