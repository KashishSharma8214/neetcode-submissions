class Solution {
    public boolean isAnagram(String s, String t) {
    
    Map<Character , Integer> h1 = new HashMap<>();
    Map<Character , Integer> h2 = new HashMap<>();
        int count = 1 ;
        if(s.length()!=t.length()){
            return false;
        }
        for(int i = 0 ; i<s.length();i++){
               if(h1.containsKey(s.charAt(i))){
                    h1.put(s.charAt(i),h1.get(s.charAt(i))+1);
                }else{
                h1.put(s.charAt(i),count);
                }

        }
        for(int i = 0 ; i<t.length();i++){
               if(h2.containsKey(t.charAt(i))){
                    h2.put(t.charAt(i),h2.get(t.charAt(i))+1);
                }else{
                h2.put(t.charAt(i),count);
                }
            }
            if(h1.equals(h2)){
                return true;
            }
        return false;
    }
}
