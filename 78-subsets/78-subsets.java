class Solution {
    public List<List<Integer>> subsets(int[] nums) {
            List<List<Integer>>res = new ArrayList<>();
      res.add(new ArrayList<>());
       if(nums==null||nums.length==0){
           return res;
       }
        int s=0;
        for(int n:nums){
            s=res.size();
            for(int i=0;i<s;i++){
                List<Integer>set = new ArrayList<>(res.get(i));
                set.add(n);
                res.add(set);
            }
        }
        return res;   
    }
}