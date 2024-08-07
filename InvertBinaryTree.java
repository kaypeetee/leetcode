class Solution {
    public void swap(TreeNode one){
        TreeNode left = one.left;
        TreeNode right = one.right; 
        TreeNode temporary = left;

        one.left= right;
        one.right = temporary;
    }


    public TreeNode invertTree(TreeNode root) {
        if (root==null) return null;
        TreeNode currentNode = root;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(currentNode);

        while(!queue.isEmpty()){
            currentNode = queue.remove();

            if(currentNode.left!=null && currentNode.right!=null){
                swap(currentNode); 
                queue.add(currentNode.left);
                queue.add(currentNode.right);
            } else if(currentNode.left!=null){
                currentNode.right=currentNode.left;
                currentNode.left=null;
                queue.add(currentNode.right);
            } else if(currentNode.right!=null){
                currentNode.left=currentNode.right;
                currentNode.right=null;
                queue.add(currentNode.left);
            }
    }
    return root;
}

}
