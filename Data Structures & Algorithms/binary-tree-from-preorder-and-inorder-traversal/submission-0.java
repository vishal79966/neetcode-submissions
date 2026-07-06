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
    HashMap<Integer,Integer> map = new HashMap<>();
    public TreeNode build(int[] preorder,int preStart,int preEnd, int[] inorder,int inStart,int inEnd){
        if(preStart>preEnd || inStart>inEnd){
            return null;
        }
        TreeNode root = new TreeNode(preorder[preStart]);
        int rootI = map.get(root.val);
        int lefInd = rootI-inStart;
        root.left = build(preorder,preStart+1,preStart+lefInd,inorder,inStart,rootI-1);
        root.right = build(preorder,preStart+lefInd+1,preEnd,inorder,rootI+1,inEnd);

        return root;
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
        return build(preorder,0,preorder.length-1,inorder,0,inorder.length-1);
    }
}
