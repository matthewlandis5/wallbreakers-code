class Solution {
    public int[] findErrorNums(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        int max=-1;
        int[] r=new int[2];
        boolean found=false;
        
        for(int t:nums){
            if(t>max)max=t;
            if(!set.contains(t))set.add(t);
            else r[0]=t;
        }
        for(int i=1;i<=max;i++){
            if(!set.contains(i)){
                r[1]=i;
                i=max+1;
                found=true;
            }
        }
        if(!found)r[1]=max+1;
        return r;
    }
}