class Solution {
    public boolean checkXMatrix(int[][] g) {
      for(int i=0;i<g.length;i++){
        for(int j=0;j<g[i].length;j++){
            if(i==j||i+j==g.length-1){
                if(g[i][j]==0){
                    return false;
                }}
                else{

                 if(g[i][j]!=0){
                    return false;
                 }
                   
                }
            }
        }       return true; 
    }
}