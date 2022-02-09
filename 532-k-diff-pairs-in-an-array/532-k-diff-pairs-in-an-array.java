class Solution {
    public int findPairs(int[] nums, int k) {
         Map<Integer,Integer> map=new LinkedHashMap<>();
        for(int i=0;i<nums.length;i++)
        {
           map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int count=0;
        for(Integer key:map.keySet())
        {
            if(k==0 && map.get(key)>1)
            {
                count++;
            }
            else if((k>0) && map.containsKey(key-k))
            {
                count++;
            }
        }
        return count;
        
    }
}