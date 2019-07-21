class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>(); 
        combinationSumHelper(candidates, target, 0, result, new LinkedList<>());
        return result;
    }
    public void combinationSumHelper(int[] candidates, int target, int index, 
                                     List<List<Integer>> result, LinkedList<Integer> temp){
       if(target==0){
           result.add(new ArrayList<>(temp));
           return;
       } 
       if(index>=candidates.length)return;
       if(candidates[index]<=target){
           temp.add(candidates[index]);
           combinationSumHelper(candidates,target-candidates[index],index,result,temp);
           temp.removeLast();
       }
       combinationSumHelper(candidates,target,index+1,result,temp); 
    }
}