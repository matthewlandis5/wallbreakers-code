class Solution {
    public int singleNumber(int[] nums) {
        boolean found=false;
        
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if((nums[i]!=-1&&nums[j]!=-1)&&nums[i]==nums[j]){
                    found=true;
                    nums[i]=-1;
                    nums[j]=-1;
                }
                if(nums[i]==-1)found=true;
            }
            if(found){
                found=false;
            }else{
                return nums[i];
            }
            found=false;
        }
        return 0;
    }
}