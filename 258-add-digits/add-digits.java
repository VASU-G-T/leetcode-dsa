class Solution {
    public int addDigits(int num) {
       int r,s,sum=0;
        int temp=num;
        while(9<temp){
              while(temp>0){

            r=temp%10;
            sum = sum+r;
            temp=temp/10;
        }

       temp=sum;
       sum=0;
      
    }
    return temp; 
    }
}