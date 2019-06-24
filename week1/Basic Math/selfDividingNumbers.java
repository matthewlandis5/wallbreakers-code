class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> r=new ArrayList<Integer>();
        Boolean a=true;
        int temp;
        for(int i=left;i<=right;i++){
            temp=i;
            while (temp>0){
                if(temp%10==0||i%(temp%10)!=0)a=false;
                temp/=10;
            }
            if(a)r.add(i);
            a=true;
        }
        return r;
    }
}