class Solution {
    public int rob(int[] nums) {
        int len=nums.length;
        if(len==0) {
            return 0;
        }
        int[][] max = new int[len][2];

        for (int k=0;k<len;k++) {
            if(k==0) {
                max[0][0]=0;
                max[0][1]=nums[0];
            }else if(k==1) {
                max[1][0] = nums[1];
                max[1][1] = Math.max(nums[0], nums[1]);
            }else if(k==len-1) {
                max[k][1] = Math.max(Math.max(max[k - 1][0], max[k - 1][1]),
                        Math.max(max[k - 2][1], max[k - 2][0] + nums[k]));
            }else{
                max[k][0] = Math.max(max[k - 2][0] + nums[k], max[k - 1][0]);
                max[k][1] = Math.max(max[k - 2][1] + nums[k], max[k - 1][1]);
            }
        }
        return max[len-1][1]; 
    }
}