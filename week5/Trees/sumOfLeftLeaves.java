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
    int sum;
    public int sumOfLeftLeaves(TreeNode root) {
        sum=0;
        recur(root,false);
        return sum;
    }
    private void recur(TreeNode root,boolean left){
        if(root==null)return;
        TreeNode leftN=root.left;
        TreeNode rightN=root.right;
        if(leftN==null&&rightN==null&&left)sum+=root.val;
        recur(leftN,true);
        recur(rightN,false);
    }
}