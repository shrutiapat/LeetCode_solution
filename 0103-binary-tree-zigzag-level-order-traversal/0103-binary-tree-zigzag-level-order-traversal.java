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

        // If the root is null, return an empty list since there's no tree to traverse.
        if (root == null)
            return new ArrayList<>();

        // This will hold the final zigzag level order traversal.
        List<List<Integer>> res = new ArrayList<>();

        // Queue to help in level order traversal.
        Queue<TreeNode> q = new LinkedList<>();

        // Start the traversal by adding the root to the queue.
        q.offer(root);

        // A boolean to track the direction of traversal.
        // Start from left to right.
        boolean leftToRight = true;

        while (!q.isEmpty()) {

            // Get the number of nodes at the current level.
            int size = q.size();

            // This list will hold the nodes' values for the current level.
            List<Integer> curLevel = new ArrayList<>(size);

            for (int i = 0; i < size; i++) {

                // Poll the first node in the queue.
                TreeNode node = q.poll();

                // Add the node's value to the current level's list.
                curLevel.add(node.val);

                // If the node has a left child, add it to the queue.
                if (node.left != null)
                    q.offer(node.left);

                // If the node has a right child, add it to the queue.
                if (node.right != null)
                    q.offer(node.right);
            }

            // If the current level needs to be right-to-left, reverse the list.
            if (!leftToRight) {
                Collections.reverse(curLevel);
            }

            // Add the current level's list to the result list.
            res.add(curLevel);

            // Toggle the direction for the next level.
            leftToRight = !leftToRight;
        }

        // Return the final zigzag level order traversal.
        return res;
    }
}