class Solution {
    public boolean isSubsequence(String s, String t) {
             if(s.length()==0)return true;
        int s1=0,t1=0;
        while(t1<t.length()){
            if(s.charAt(s1)==t.charAt(t1))
                s1++;
            if(s.length()==s1)
                return true;
              t1++;
        }
      
        return false;
        
    }
}