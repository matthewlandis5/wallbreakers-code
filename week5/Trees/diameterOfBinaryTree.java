/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    private int max;
    public int diameterOfBinaryTree(TreeNode root) {
        max=0;
        recur(root);
        return max;
    }
    private int recur(TreeNode root){
        if(root==null)return 0;
        int l=recur(root.left);
        int r=recur(root.right);
        if(l+r>max)max=l+r;
        if(l>r)return l+1;
        return r+1;
    }
}