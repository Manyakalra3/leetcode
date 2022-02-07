class Solution {
    
    public char findTheDifference(String s, String t) {
       HashMap<Character,Integer> map = new HashMap<>();
        
        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        
        for(char ch:t.toCharArray()){
            if(!map.containsKey(ch)){
                return ch;
            }
            else{
                int value = map.get(ch);
                map.put(ch,--value);
                if(value==0){
                    map.remove(ch);
                }
            }
            
        }
        
        return 'a';
    }
}