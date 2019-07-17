class Solution {
    private List<Integer> t;
    private List<List<Integer>> ret;
    private int start,end;
    
    public List<List<Integer>> permute(int[] nums) {
        t=new ArrayList<>();
        ret=new ArrayList<>();
        recur(nums,0,nums.length-1);
        return ret;
    }
    
    private void recur(int[] nums,int start,int end){ 
		if (start==end){
            t=new ArrayList<>();
            for(int i:nums){
                t.add(i);
            }
            ret.add(t);
        }else{ 
			for(int i=start;i<=end;i++){ 
				nums=flip(nums,start,i);
				recur(nums,start+1,end); 
				nums=flip(nums,start,i); 
			} 
		} 
	} 
	public int[] flip(int[] arr,int i,int j) { 
		int temp;
		temp=arr[i] ; 
		arr[i]=arr[j]; 
		arr[j]=temp; 
		return arr; 
	}
}