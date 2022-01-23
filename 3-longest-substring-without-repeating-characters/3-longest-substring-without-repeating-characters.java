class Solution {
    public int lengthOfLongestSubstring(String s) {
        int ml=0,tl=0,i=0;
        int head=0;
        
        
        if(s.length()==0)
            return 0;
        Set<Character> st=new HashSet<>();
        while(i<s.length()){
            char ch=s.charAt(i);
            if(!st.contains(s.charAt(i))){
                st.add(s.charAt(i++));
                  ml=Math.max(st.size(),ml);
            
            }
            else{
                
                st.remove(s.charAt(head++));
          
            }
          
        }
        return ml;
    }
}