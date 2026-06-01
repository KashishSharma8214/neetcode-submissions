class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String,List<String>> h1 = new HashMap<>();
        for(int i = 0 ; i<strs.length;i++){
            char[] c1 = strs[i].toCharArray();
            Arrays.sort(c1);
            String Key = new String(c1);
            h1.putIfAbsent(Key, new ArrayList<>());
            h1.get(Key).add(strs[i]);
            


        }
        return new ArrayList<>(h1.values());

        
    }
}
 