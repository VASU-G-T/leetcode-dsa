class Solution {
    public int maxArea(int[] h) {
int l=0;
int r=h.length-1;
int m=0;
for(int i=0;i<h.length;i++){
    int c=Math.min(h[l],h[r])*(r-l);
    m=Math.max(c,m);
    if(h[l]<h[r]){
        l++;

    
    }else{
        r--;
    }
}
  return m;   
    }
}