class Solution {
    public int peakIndexInMountainArray(int[] A) {
        int bot=0;
        int mid=A.length/2;
        int up=A.length;
        
        while(bot<=up){
            if(A[mid]>A[mid-1]&&A[mid]>A[mid+1])return mid;
            if(A[mid]>A[mid-1]){
                bot=mid;
            }else{
                up=mid;
            }
            mid=(up+bot)/2;
        }
        return -1;
    }
}