class Solution {
    public List<Integer> partitionLabels(String S) {
        List<Integer> split=new ArrayList<Integer>();
        int[] arr=new int[26];
        for(int i=0;i<S.length();i++){
            arr[(int)S.charAt(i)-97]=i;
            //finds the final instance of each letter
        }
        int max=0;
        int last=0;

        for(int i=0;i<S.length();i++){
            max=Math.max(arr[(int)S.charAt(i)-97],max);
            if(max==i){
                split.add(i+1-last);
                last=i+1;
            }
        }
        return split;
    }
}