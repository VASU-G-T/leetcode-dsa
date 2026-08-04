class Solution {
    public int reverse(int x) {
       int y=x;
       int r;
       long sum=0;
       while(y!=0){
        r=y%10;
        sum=(sum*10)+r;
        y=y/10;
       } 
       if (sum > Integer.MAX_VALUE || sum < Integer.MIN_VALUE)
            return 0;
       return (int) sum;
    }
}