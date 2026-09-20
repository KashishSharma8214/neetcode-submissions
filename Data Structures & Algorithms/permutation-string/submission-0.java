class Solution {
    public boolean checkInclusion(String s1, String s2) {

        int n = s1.length();
        int m = s2.length();
        

        if( n > m ){
            return  false ; 
        }

        int[] s1Map = new int[26];
        int[] s2Map = new int[26];

        for( int i = 0 ; i < n ; i++){
            s1Map[s1.charAt(i)-'a']++;
            s2Map[s2.charAt(i)-'a']++;
        }

        
        if(isMatched(s1Map,s2Map)){
            return true;
        }
        

        for( int i = 0 ; i < m-n ; i ++){

            s2Map[s2.charAt(i)-'a']--;
            s2Map[s2.charAt(i+n)-'a']++;

              if(isMatched(s1Map,s2Map)){
            return true;
        }



        }
        return false;

    }
       
        
    

    private boolean isMatched(int[] s1Map , int[] s2Map){
        for(int i = 0 ; i < 26 ; i++){
            if(s1Map[i]!= s2Map[i]){
                return false;
            }

        }
        return true;
    }
}

