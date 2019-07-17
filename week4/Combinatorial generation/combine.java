class Solution {
    private List<Integer> t;
    private List<List<Integer>> ret;
    private int range;
    
    public List<List<Integer>> combine(int n, int k){
        t=new ArrayList<>();
        ret=new ArrayList<>();
        range=k;
        int[] arr=new int[n];
        for(int i=1;i<=n;i++){
            arr[i-1]=i;
        }
		combination(arr,n); 
        return ret;
    }
    
    private void assist(int arr[],int temp[],int start, 
								int end,int index){ 
        t=new ArrayList<>();
		if(index==range){ 
			for (int i=0;i<range;i++) 
				t.add(temp[i]); 
			ret.add(t);
			return; 
		} 
		for (int i=start;i<=end&&end-i+1>=range-index; i++){ 
			temp[index]=arr[i]; 
			assist(arr, temp, i+1, end, index+1); 
		} 
	} 
    
	private void combination(int arr[], int n){ 
		int temp[]=new int[range]; 
		assist(arr,temp,0,n-1,0); 
	}  
}