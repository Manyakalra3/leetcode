class Solution {
    public boolean wordPattern(String pattern, String s) {
          String[]words = s.split(" ");
        if(words.length!=pattern.length())
            return false;
        HashMap<String,Integer>map1= new HashMap();
        HashMap<Character,Integer>map2= new HashMap();
        for (Integer i = 0; i < pattern.length(); i++)
			if (map1.put(words[i], i) != map2.put(pattern.charAt(i), i))
				return false;
		return true;
    }
}