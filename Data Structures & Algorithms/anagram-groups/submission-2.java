class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        //Input: strs = ["act","pots","tops","cat","stop","hat"]
        //Output: [["hat"],["act", "cat"],["stop", "pots", "tops"]]

            HashMap<String ,List<String>> map = new HashMap<>();

            for ( String s : strs ){
                //'act'
                    int[] count = new int[26];
                    char[] ch = s.toCharArray();
                    for(Character c : ch){
                        count[c-'a']++; // this ['a'-'a']= 0 ++ is used for next time a came frequency count = 1 
                        
                    }
                    StringBuilder sb = new StringBuilder();
                    for ( int i : count ){
                        sb.append("*");
                        sb.append(i);
                    }
                    String key = sb.toString();
                    if(!map.containsKey(key)){
                        map.put(key,new ArrayList<String>());
                    }
                    map.get(key).add(s);

            }
            return new ArrayList<>(map.values());
 
        }
        
         }        

    
