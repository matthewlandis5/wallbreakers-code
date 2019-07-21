class Solution {
    private int nIn;
    public List<String> generateParenthesis(int n) {
        nIn=n;
        List<String> list=new ArrayList<>();
        generateParenthesis(0,0,list,"");
        return list;
    }
    public void generateParenthesis(int start,int end,List<String> result,String str) {
        if(str.length()==nIn*2){
            result.add(str);
            return;
        }
        if(start<nIn){
            generateParenthesis(start+1,end,result,str+"(");
        }
        if(end<start){
            generateParenthesis(start,end+1,result,str+")");
        }  
    }
}