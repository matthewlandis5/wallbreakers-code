class Solution {
    public int calPoints(String[] ops) {
        int sum=0;
        int temp;
        int temp2;
        Stack<Integer> stack = new Stack<Integer>();
        
        for(int i=0;i<ops.length;i++){
            if(ops[i].equals("+")){
                temp=stack.pop();
                temp2=temp+stack.peek();
                sum+=temp2;
                stack.push(temp);
                stack.push(temp2);
            }else if(ops[i].equals("D")){
                temp=stack.peek()*2;
                sum+=temp;
                stack.push(temp);
            }else if(ops[i].equals("C")){
                sum-=stack.pop();
            }else{
                temp=Integer.valueOf(ops[i]); 
                stack.push(temp);
                sum+=temp;
            }
        }
        return sum;
    }
}