class Solution {
    Boolean[]dp = new Boolean[100001];
    public boolean winnerSquareGame(int n) {
        
       return helper(n,dp);
    }
    //topdown
    public boolean helper(int n,Boolean[]dp){
         if(n ==0)return false;
        if(dp[n]!=null)return dp[n];
        boolean winner= false;
        for(int i=1;i*i<=n;i++){
            if(!helper(n-(i*i),dp)){
                winner=true;
                break;
            }
        }   
        return dp[n]= winner;
    }
}