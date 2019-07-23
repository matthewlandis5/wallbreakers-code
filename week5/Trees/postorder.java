/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val,List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/
class Solution {
    private List<Integer> ret=new ArrayList<>();
	
    public List<Integer> postorder(Node root) {
        recur(root);
        return ret;
    }
    private void recur(Node root){
        if(root==null)return;
        List<Node> temp=root.children;
        if(root.children.size()==0)ret.add(root.val);
        else{
            for(Node i:root.children){
                postorder(i);
            }
            ret.add(root.val);
        }
    }
}