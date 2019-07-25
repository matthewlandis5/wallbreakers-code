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
    public int longestUnivaluePath(TreeNode root) {
        max=0;
        recur(root,-1);
        return max;
    }
    private int[] recur(TreeNode root,int lastVal){//ret[0]=max found //ret[1]=val
        int[] ret=new int[2];
        ret[0]=0;
        ret[1]=Integer.MIN_VALUE;
        if(root==null)return ret;
        
        int temp;
        int[] l,r;
        ret[1]=root.val;
        l=recur(root.left,ret[1]);
        r=recur(root.right,ret[1]);
        
        if(ret[1]==l[1]&&ret[1]==r[1]){
            temp=l[0]+r[0]+2;
            if(temp>max)max=temp;
            if(l[0]>r[0]){
                ret[0]=l[0]+1;
                return ret;
            }
            ret[0]=r[0]+1;
                return ret;
        }else if(ret[1]==l[1]){
            temp=l[0]+1;
            if(temp>max)max=temp;
            ret[0]=temp;
            return ret;
        }else if(ret[1]==r[1]){
            temp=r[0]+1;
            if(temp>max)max=temp;
            ret[0]=temp;
            return ret;
        }else{
            if(l[0]>max)max=l[0];
            if(r[0]>max)max=r[0];
            ret[0]=0;
            return ret;
        }
        
        
    }
}