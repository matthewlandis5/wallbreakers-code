class Solution {
    public List<String> subdomainVisits(String[] cpdomains) {
        Map<String, Integer> map=new HashMap();
        
        for(String str: cpdomains){
            String[] split = str.split(" ");
            int count = Integer.valueOf(split[0]);
            addToMap(map, split[1], count);
            
            String[] subs =split[1].split("\\.");
            int len=subs.length;
            if(len==3){
               addToMap(map, subs[2], count);
               addToMap(map, subs[1]+"."+subs[2], count);
            }
            
            if(len==2)addToMap(map, subs[1], count);
        }
        ArrayList<String> r = new ArrayList();
        
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            r.add(entry.getValue() + " " + entry.getKey());
        }
        return r;
    }
    
    
    private void addToMap(Map map, String value, int count){
        if(!map.containsKey(value)){
            map.put(value, count);
        }else{
            map.put(value, ((int)map.get(value))+count);
        }     
    }
}