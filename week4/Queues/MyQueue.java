class MyQueue {
    
    private Stack<Integer> s;
    private Stack<Integer> s2;
    private int top;
    
    /** Initialize your data structure here. */
    public MyQueue() {
        s = new Stack<Integer>();
        s2 = new Stack<Integer>();
        top=-1;
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
        if(s.empty()){
            top=x;
            s.push(x);
        }else{
            while (!s.empty()){
                s2.push(s.pop());
            }
            s2.push(x);
            while (!s2.empty()){
                s.push(s2.pop());
            }
        }
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        int temp=s.pop();
        if (!s.empty()) {
            top=s.peek();
        }
        return temp;
    }
    
    /** Get the front element. */
    public int peek() {
        return top;
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        return s.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */