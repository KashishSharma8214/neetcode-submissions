class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

    HashMap< String , List<String>> map = new HashMap<>();

    for( String s : strs){
        int[] arr = new int[26];

        char[] c1 = s.toCharArray();

        for( Character c : c1){
            arr[c-'a']++;

      }
      StringBuilder builder = new StringBuilder();
      
      for( int i : arr){
        builder.append(i);
        builder.append("*");

      }
      String newFinal = builder.toString();

      if(!map.containsKey(newFinal)){
        map.put(newFinal , new ArrayList<>());
      }
      map.get(newFinal).add(s);



    }
    return new ArrayList<>(map.values());

        
    }
}
