class Solution {
    public int distributeCandies(int[] candies) {
        Set<Integer> in = new HashSet<>(); 
        int len=candies.length/2;
        for(int temp:candies){
            if(!in.contains(temp))in.add(temp);
            if(in.size()==len)return len;
        } 
        return in.size();
    }
}