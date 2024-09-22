class Solution {
    class Pair{
        public TreeNode node;
        public int offset = 0;
        public Pair(TreeNode n){
            this.node = n;
        }
        public Pair(TreeNode n, int offs){
            this.node = n;
            this.offset = offs;
        }
    }
    
    public int widthOfBinaryTree(TreeNode root) {
        LinkedList<Pair> queue = new LinkedList<>();
        queue.addFirst(new Pair(root));
        int maxWidth = 0;

        while(!queue.isEmpty()){
            int size = queue.size();
            int min = 0;
            int max = 0;
            for(int i = 0; i < size; i++){
                Pair p = queue.removeLast();
                int idx = p.offset;

                if(i == 0){
                    min = idx;
                }

                if(i == size-1){
                    max = idx;
                }
                
                if(null != p.node.left){
                    queue.addFirst(new Pair(p.node.left, idx*2+1));
                }

                if(null != p.node.right){
                    queue.addFirst(new Pair(p.node.right, idx*2+2));
                }


            }
            maxWidth = Math.max(maxWidth, max-min+1);
        }
            
        return maxWidth;
    }

}