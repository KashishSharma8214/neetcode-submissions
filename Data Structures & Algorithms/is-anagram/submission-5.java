class Solution {
    public boolean isAnagram(String s, String t) {

        char[] c1 = s.toCharArray();
        char[] c2 = t.toCharArray();
        //a,a,c,c,e,r,r,  -> a,a,c,c,e,r,r
        Arrays.sort(c1);
        Arrays.sort(c2);
        if(Arrays.equals(c1,c2)){
            
            return true;
        }
   return false;
    }
}
