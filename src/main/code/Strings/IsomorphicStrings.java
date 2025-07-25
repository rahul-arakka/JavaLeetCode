//https://leetcode.com/problems/isomorphic-strings/description/?envType=problem-list-v2&envId=string

class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length())    return false;
        HashMap<Character, Character> mp = new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(mp.get(s.charAt(i)) == null){
                if(mp.containsValue(t.charAt(i)))    return false;
                mp.put(s.charAt(i), t.charAt(i));
            }
            if(t.charAt(i) != mp.get(s.charAt(i))){
                return false;
            }
            // else{
            //     if(t.charAt(i) != mp.get(s.charAt(i))){
            //         return false;
            //     }
            // }
        }
        return true;
    }
}