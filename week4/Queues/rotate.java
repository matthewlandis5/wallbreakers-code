class Solution {
    public void rotate(int[] nums, int k) {
        int len=nums.length;
        if(len>1&&len!=k&&k!=0){
            if(k>len)k%=len;
            int[] ret=new int[len];
            int count=0;
            int i;
            for(i=len-k;i<len;i++,count++){
               ret[count]=nums[i];
            }
            for(i=0;i<len-k;i++,count++){
                ret[count]=nums[i];
            }
            for(i=0;i<len;i++)nums[i]=ret[i];
        }
    }
}