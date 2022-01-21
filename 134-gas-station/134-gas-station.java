class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int start=0,rem=0,curr=0;
        for(int i=0;i<gas.length;i++){
             curr+=gas[i]-cost[i];
            if(curr<0){
                start=i+1;
                rem+=curr;
                curr=0;
                
            }
        }
            if(curr+rem>=0){
                return start;
            }
        return -1;
    }
}