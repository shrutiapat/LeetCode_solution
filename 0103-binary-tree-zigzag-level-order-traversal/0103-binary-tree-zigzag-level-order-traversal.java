/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null) return ans;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root); boolean flag = false;
        while(!q.isEmpty()){
            int size = q.size();
            LinkedList<Integer> l = new LinkedList<>();
            while(size-- > 0){
                TreeNode node = q.poll();
                if(flag){
                    l.addFirst(node.val);
                }
                else{
                    l.add(node.val);
                }
                if(node.left != null){q.offer(node.left);}
                if(node.right != null){q.offer(node.right);}
            }
            flag = !flag;
            ans.add(l);
        }
        return ans;
        
    }
}