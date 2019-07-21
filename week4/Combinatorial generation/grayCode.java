class Solution {
    public List<Integer> grayCode(int n) {
        List<Integer> list = new ArrayList<>();
        list.add(0);
        if (n==0) {
            return list;
        }
        list.add(1);
        int mod=2;
        for (int i=1;i<n;i++) {
            int len = list.size();
            for (int k=len-1;k>=0;k--) {
                list.add(list.get(k)+mod);
            }
            mod*=2;
        }
        return list;
    }
}