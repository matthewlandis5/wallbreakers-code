class Solution {
    Map<Character,Character> mappings=new HashMap<>();
    public boolean isValid(String s){
        mappings.put('(', ')');
        mappings.put('[', ']');
        mappings.put('{', '}');
        Stack<Character> parenthesis = new Stack<>();
        for(int i=0;i<s.length();i++) {
            char c=s.charAt(i);
            if(mappings.containsKey(c)){
                 parenthesis.push(mappings.get(c));
            }else{
                if(parenthesis.isEmpty()||parenthesis.pop()!=c) {
                    return false;
                }
            }
        }
        return parenthesis.isEmpty();
    }
}