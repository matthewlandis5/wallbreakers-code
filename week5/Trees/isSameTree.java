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
    private List<Integer> list1=new ArrayList<>();
    private List<Integer> list2=new ArrayList<>();
    
    public boolean isSameTree(TreeNode p, TreeNode q) {
        recur1(p);
        recur2(q);
        return list1.equals(list2);
    }
    
    private void recur1(TreeNode root){
        if(root==null){
            list1.add(null);
            return;
        }else{
            list1.add(root.val);
            recur1(root.left);
            recur1(root.right);
        }
    }
    private void recur2(TreeNode root){
        if(root==null){
            list2.add(null);
            return;
        }else{
            list2.add(root.val);
            recur2(root.left);
            recur2(root.right);
        }
    }
}