class Solution {
    public int findPairs(int[] nums, int k) {
        HashSet<Integer>number = new HashSet<>();
        HashSet<Integer>Set= new HashSet<>();
        if(k<0)
            return 0;
        for(int n:nums){
        if(number.contains(n+k))
            Set.add(n);
        if(number.contains(n-k))
            Set.add(n-k);
            number.add(n);
        }
        return Set.size();
    }
}