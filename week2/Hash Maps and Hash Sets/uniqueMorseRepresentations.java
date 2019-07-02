class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] morse ={".-","-...","-.-.","-..",".","..-.","--.","....","..",
                ".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-",
                "..-","...-",".--","-..-","-.--","--.."};
        char[] alph ={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p',
                'q','r','s','t','u','v','w','x','y','z'};
        Set<String> done = new HashSet<>(); 
        String temp;
        Boolean unique=true;
        
        for(int i=0;i<words.length;i++){
            temp="";
            for(int j=0;j<words[i].length();j++){
                for(int k=0;k<alph.length;k++){
                    if(words[i].charAt(j)==alph[k])temp+=morse[k];
                }
            }
            if(!done.contains(temp))done.add(temp);
            else unique=true;
            //System.out.println(done);
        }
        /*for(String t:words){//code written with for each loops which uses more memory
            temp="";
            for(int j=0;j<t.length();j++){
                for(int k=0;k<alph.length;k++){
                    if(t.charAt(j)==alph[k])temp+=morse[k];
                }
            }
            for(String s:tran){
                if(s.equals(temp)){
                    unique=false;
                }
            }
            if(unique)tran.add(temp);
            else unique=true;
        }*/
        return done.size();
    }
}