class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        
 int start = 0, currentBalance = 0, remainingBalance = 0;
       // iterate through each gas station and update the starting point, which takes O(n) time
        for (int i = 0; i < cost.length; i++) {
            // update the current gas balance
            currentBalance += gas[i] - cost[i];
            // if the currently considering balance < 0, we can't move to the next gas station -> the current start is invalid
            if (currentBalance < 0) {
                start = i + 1; // update start to new candidate value
                remainingBalance += currentBalance; // update the negative balance (of the remaining part)
                currentBalance = 0; // reset the currently considering balance
            }
        }
        // at the end, we check whether the positive balance (currentBalance) can compensate the remainingBalance (currentBalance + remainingBalance has to be >= 0)
        return currentBalance + remainingBalance >= 0 ? start : -1;
            }
}