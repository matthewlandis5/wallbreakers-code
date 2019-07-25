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
    private int maxDistance,leftmostVal,countLeft;
    public int findBottomLeftValue(TreeNode root) {
        maxDistance=0;
        countLeft=0;
        leftmostVal=root.val;
        recur(root,0,0);
        return leftmostVal;
    }
    private void recur(TreeNode root,int distance,int leftCount){
        if(root==null)return;
        if(distance>=maxDistance){
            if(distance>maxDistance||leftCount>countLeft){
                leftmostVal=root.val;
                maxDistance=distance;
                countLeft=leftCount;
            }
        }
        recur(root.left,distance+1,leftCount+1);
        recur(root.right,distance+1,leftCount);
    }
}