class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int len1=nums1.length;
        int len2=nums2.length;
        Map<Integer, Integer> map=new HashMap();
        int[] ans=new int[nums1.length];
        Arrays.fill(ans, -1);
        for(int i=0;i<len2;i++)
            map.put(nums2[i],i);
        for(int i=0;i<len1;i++){
            for(int j=map.get(nums1[i]);j<len2;j++){
                if(nums1[i]<nums2[j]){
                    ans[i]=nums2[j];
                    break;
                }
            }
        }
        return ans;
    }
}