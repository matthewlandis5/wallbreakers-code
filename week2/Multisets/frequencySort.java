class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<>(); 
        for(char c:s.toCharArray()){
            if(map.containsKey(c))map.put(c,map.get(c)+1);
            else map.put(c,1);
        }
        String str="";
        HashSet<Character> remSet=new HashSet<>();
        int max=0;
        char temp=' ';
        int count=0;
        while(count<s.length()){
            for(char c:s.toCharArray()){
                if(map.get(c)>max&&!remSet.contains(c)){
                    max=map.get(c);
                    temp=c;
                }
            }
            for(int i=0;i<max;i++)
                str+=temp;
            remSet.add(temp);
            max=0;
            count++;
        }
        return str;
    }
}