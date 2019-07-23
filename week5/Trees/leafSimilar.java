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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        recur1(root1);
        recur2(root2);
        return list1.equals(list2);
        
    }
    private void recur1(TreeNode root){
        if(root==null)return;
        TreeNode tempL=root.left;
        TreeNode tempR=root.right;
        if(tempL==null&&tempR==null)list1.add(root.val);
        else{
            recur1(tempL);
            recur1(tempR);
        }
    }
    private void recur2(TreeNode root){
        if(root==null)return;
        TreeNode tempL=root.left;
        TreeNode tempR=root.right;
        if(tempL==null&&tempR==null)list2.add(root.val);
        else{
            recur2(tempL);
            recur2(tempR);
        }
    }
}