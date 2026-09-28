class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        String b="";
        for (int i=0;i<s.length();i++){
            char d=s.charAt(i);
            if(Character.isLetterOrDigit(d)){
                b=b+d;
            
            }
        }
        String c="";
        for(int i=b.length()-1;i>=0;i--){
        c +=b.charAt(i);
        }
        return b.equals(c);
    }
}