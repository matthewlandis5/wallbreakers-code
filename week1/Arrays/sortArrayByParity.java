class Solution {
    public int[] sortArrayByParity(int[] A) {
        ArrayList<Integer> returned=new ArrayList<Integer>();
        for(int i=0;i<A.length;i++){
            if(A[i]%2==1){
                returned.add(A[i]);
            }else{
                returned.add(0,A[i]);
            }
        }
        int[] temp=new int[A.length];
        for(int i=0;i<A.length;i++){
            temp[i]=returned.get(i);
        }
        return temp;
        
    }
}