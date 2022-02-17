class Solution {
    List<List<Integer>>res= new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        
        helper(candidates,0,target,new ArrayList<Integer>());
        return res;
    }
    public void helper(int[]can , int start, int target, List<Integer>each){
        for(int i=start ; i<can.length ; i++){
            List<Integer>list= new ArrayList<>(each);
            if(can[i]==target){
                list.add(can[i]);
                res.add(list);
            break;
            }
          else if(can[i]<target){
              list.add(can[i]);
                helper(can,i,target-can[i],new ArrayList<>(list));
          }
            else {
                break;
            }
        }
        return;
    }
}