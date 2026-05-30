class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        //Input: strs = ["act","pots","tops","cat","stop","hat"]
        //Output: [["hat"],["act", "cat"],["stop", "pots", "tops"]]

        HashMap<String,List<String>> map = new HashMap<>();

        for(String s : strs){
           //[ a , c , t]
            int[] arr = new int[26];
            char[] c1 = s.toCharArray(); 
            for(Character c : c1){
                arr[c-'a']++;
                System.out.println(arr[c -'a']++);
            }
            //
        
        StringBuilder sorted = new StringBuilder();
        for( int i : arr){
        sorted.append("*");
        sorted.append(i); }

        
        String nst = sorted.toString();
        if(!map.containsKey(nst)){
            map.put(nst,new ArrayList<>());
        }
            map.get(nst).add(s);
        }  
          
         return new ArrayList<>(map.values());       
}
    }
