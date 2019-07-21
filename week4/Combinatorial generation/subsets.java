class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        return recur(nums, 0);
    }
    
    public List<List<Integer>> recur(int[] nums, int i) {
        List<List<Integer>> ret;
        if(nums.length<=i){
            ret = new ArrayList<>();
            ret.add(new ArrayList<Integer>());
            return ret;
        }
        ret=recur(nums,i+1);
        int len= ret.size();
        for (int j=0;j<len;j++) {
            List<Integer> temp=new ArrayList<>(ret.get(j));
            temp.add(nums[i]);
            ret.add(temp);
        }
        return ret;
    }
}