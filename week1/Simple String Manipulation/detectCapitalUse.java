class Solution {
    public boolean detectCapitalUse(String word) {
        if(word.toUpperCase().equals(word)||
            word.toLowerCase().equals(word))return true;
        if(word.substring(0,1).toUpperCase().equals(word.substring(0,1))&&
           word.substring(1).toLowerCase().equals(word.substring(1)))return true;
        return false;
    }
}