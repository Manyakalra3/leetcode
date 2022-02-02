class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        HashMap<Character, Integer> map = new HashMap<>();
        LinkedList<Integer> result = new LinkedList<>();
        for(char ch: p.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }
        
        HashMap<Character, Integer> mapCopy = new HashMap<>(map);
        for(int i = 0, j = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (mapCopy.containsKey(ch)) {
                int count = mapCopy.getOrDefault(ch, 0);
                if (count == 1) {
                    mapCopy.remove(ch);
                } else {
                   mapCopy.put(ch, mapCopy.get(ch)-1); 
                }
                if (mapCopy.isEmpty()) {
                    result.add(j);
                    mapCopy.put(s.charAt(j), mapCopy.getOrDefault(s.charAt(j), 0)+1);
                    j++;
                }
            } else if (map.containsKey(ch)) {
                mapCopy.put(s.charAt(j), mapCopy.getOrDefault(s.charAt(j), 0)+1);
                j++;
                i--;
            } else {
                mapCopy = new HashMap<>(map);
                j = i+1;
            }
        }
        
        return result;
    }
}