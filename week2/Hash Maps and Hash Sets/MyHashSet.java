class MyHashSet {
    private ArrayList<Integer> set;
    /** Initialize your data structure here. */
    public MyHashSet() {
       set=new ArrayList<>(); 
    }
    
    public void add(int key) {
        boolean found=false;
        for(int i=0;i<set.size();i++){
            if(set.get(i)==key){
                found=true;
            }
        }
        if(!found)set.add(key);
    }
    
    public void remove(int key) {
        for(int i=0;i<set.size();i++){
            if(set.get(i)==key){
                System.out.println("Removing index: "+i);
                set.remove(i);
                i=set.size();
            }
        }
    }
    
    /** Returns true if this set contains the specified element */
    public boolean contains(int key) {
        for(int i=0;i<set.size();i++){
            if(set.get(i)==key)return true;
        }
        return false;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */