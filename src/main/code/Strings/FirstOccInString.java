//https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/?envType=problem-list-v2&envId=string


class Solution {
    public int strStr(String big, String sml) {
        //  Solution 1:
//        return big.indexOf(sml);


        // Solution 2:
        // int j=sml.length()-1, index=-1;
        // if(big.length() == sml.length())    return 0;
        // for(int i=big.length()-1;i>=0;i--){
        //     // if(j == )   return index;
        //     if(j<0)    j = sml.length()-1;
        //     if(big.charAt(i) != sml.charAt(j)){
        //         j = sml.length()-1;
        //         index = -1;
        //         continue;
        //     }
        //     index = i;
        //     j--;

        //     // if(j == sml.length())   return index-(sml.length()-1);
        // }
        // // if(index = )
        // return index;
        if(big == sml)    return 0;
        if(big.length() < sml.length())    return -1;
        // int j=0;
        // for(int i=0;i<=big.length()-sml.length();i++){
        //     if(big.charAt(i) == sml.charAt(0) && big.charAt((i+sml.length()-1)) ==  sml.charAt(sml.length()-1))   return i;
        // }
        // return -1;
        boolean flag = false;
        for(int i=0;i<=(big.length()-sml.length());i++){
            // if(big.length()-i < sml.length())   return -1;
            if(big.charAt(i) == sml.charAt(0)){
                flag = true;
                for(int k = 0; k<sml.length();k++){
                    int x = i+k;
                    // System.out.println("i: "+i + " k:"+k + " i+k:" + (i+k) + " x: "+x);
                    if(big.charAt((i+k)) != sml.charAt(k)){
                        flag = false;
                        break;
                    }
                }
                if(flag)    return i;
            }
        }
        if(!flag) return -1;
        return -1;
    }
}