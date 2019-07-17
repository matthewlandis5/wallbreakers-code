class MyStack {
    private Queue<Integer> q;
    private Queue<Integer> q2;
    private int top;
    
    /** Initialize your data structure here. */
    public MyStack() {
        q=new LinkedList<>();
        q2=new LinkedList<>();
        top=-1;
    }
    
    /** Push element x onto stack. */
    public void push(int x) {
        q2.add(x);
        top=x;
        while (q.size()!=0) {
            q2.add(q.remove());
        }
        Queue<Integer> temp=q;
        q=q2;
        q2=temp;
    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        int temp=q.remove();
        if (!q.isEmpty()) {
            top = q.peek();
        }
        return temp;
    }
    
    /** Get the top element. */
    public int top() {
        return top;
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
        return q.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */