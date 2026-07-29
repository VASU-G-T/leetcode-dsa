class Solution {
    public boolean isHappy(int n) {
        int r,s,sum=0;
        int temp=n;
        while(4<temp){
              while(temp>0){

            r=temp%10;
            r=r*r;
            sum = sum+r;
            temp=temp/10;
        }

       temp=sum;
       sum=0;
        }
 if (temp==1){
 return true;
 }else{
    return false;
 }
    }
}