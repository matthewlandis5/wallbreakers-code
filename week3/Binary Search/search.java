class Solution {
    public int search(int[] nums, int target) {
        if(nums.length==0||nums[0]>target||nums[nums.length-1]<target)return -1;
        int mid=nums.length/2;
        int bot=0;
        int up=nums.length;
        while(bot<=up){
            if(nums[mid]==target)return mid;
            else if(nums[mid]>target){
                up=mid-1;
                mid=(up+bot)/2;
            }else if(nums[mid]<target){
                bot=mid+1;
                mid=(up+bot)/2;
            }
        }
        return -1;
    }
}