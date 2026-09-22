class Solution {
    public boolean detectCapitalUse(String w) {
        char[] a=w.toCharArray();
        int c=0,v=0;
        for(int i=0;i<a.length;i++){
            if(Character.isUpperCase(a[i])){
                 c++;
            }else{
                v++;
        }
        }
        if(c==a.length || v==a.length ||(Character.isUpperCase(a[0])&& c==1)){
            return true;
        }
        else {
            return false;
        }
    }}
