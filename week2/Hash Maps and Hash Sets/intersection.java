class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> n1 = new HashSet<>();
        HashSet<Integer> n2 = new HashSet<>();
        HashSet<Integer> f = new HashSet<>();
        for(int t:nums1){
            n1.add(t);
        }
        for(int t:nums2){
            n2.add(t);
        }
        if(n1.size()<n2.size()){
            for(int t:n1){
                if(!f.contains(t)&&n2.contains(t))f.add(t);
            }
        }else{
           for(int t:n2){
                if(!f.contains(t)&&n1.contains(t))f.add(t);
            } 
        }
        int[] r=new int[f.size()];
        int count=0;
        for(int t:f){
            r[count]=t;
            count++;
        }
        return r;
    }
}