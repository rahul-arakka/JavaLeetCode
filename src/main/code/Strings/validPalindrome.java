class Solution {
    public boolean isValid(String s) {
        int len = s.length();
        if(s.length()%2 != 0)   return false;
        char arr[] = new char[s.length()];
        int x = 0, y = len-1;
        for(int i=0;i<len;i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{'){
                arr[x++] = s.charAt(i);
            }
            else{
                // System.out.println(" 0th value: " + arr[x-1] + "& x: "+(x-1));
                if(x<=0) return false;
                if(s.charAt(i) == ')'){
                    if (arr[x-1] == '('){
                        // arr[y--] = arr[x-1];
                        arr[x-1] = 'F';
                        x--;
                        continue;
                    }else return false;
                }
                else if(s.charAt(i) == ']'){
                    if (arr[x-1] == '['){
                        // arr[y--] = arr[x-1];
                        arr[x-1] = 'F';
                        x--;
                        continue;
                    }else return false;
                }
                else{
                    if (arr[x-1] == '{'){
                        // arr[y--] = arr[x-1];
                        arr[x-1] = 'F';
                        x--;
                        continue;
                    }else return false;
                }
            }
        }
        System.out.println("END 0th value: " + arr[0] + "& x: "+x);
        if(arr[0] != 'F')
            return false;
        return true;

        // char ele = s.charAt(0);
        // int idx = 0;
        // if(s.length()%2 != 0)   return false;
        // boolean res = false;
        // // if(s.length() <= 1) return false;
        // for(int i=0;i<s.length();i++){
        //     res = false;
        //     if(s.charAt(i) == ')' ){
        //         if(ele == '('){
        //             res = true;
        //             if(idx == 0){
        //                 ele = s.charAt(i);
        //             }else
        //             ele = s.charAt(idx-1);
        //             continue;
        //         }
        //         else return false;
        //     }
        //     else if(s.charAt(i) == ']' ){
        //         if(ele == '['){
        //             res = true;
        //             if(idx == 0){
        //                 ele = s.charAt(i);
        //             }else
        //             ele = s.charAt(idx-1);
        //             continue;
        //         }

        //         else return false;
        //     }
        //     else if(s.charAt(i) == '}' ){
        //         if(ele == '{'){
        //             res = true;
        //             if(idx == 0){
        //                 ele = s.charAt(i);
        //             }else
        //             ele = s.charAt(idx-1);
        //             continue;
        //         }
        //         else return false;
        //     }
        //     else{
        //         ele = s.charAt(i);
        //         if(i != 0)   idx++;
        //     }

        // }
        // if(idx != s.length()-1)   return false;
        // return res;
        // for(int i=0;i<s.length();i++){
        //     if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{'){
        //         for(int j=i+1; j<s.length();j++){
        //             if(s.charAt(i) == '(' && s.charAt(j) == ')'){
        //                 return false;
        //             }
        //             else{
        //                 if(s.charAt(i) == '[' && s.charAt(j) != ']'){
        //                 return false;
        //             }else break;

        //             }
        //             else{
        //                 if(s.charAt(i) == '{' && s.charAt(j) != '}'){
        //                 return false;
        //             } else break;
        //             }
        //         }
        //     }
        // }
        // return true;
    }
}