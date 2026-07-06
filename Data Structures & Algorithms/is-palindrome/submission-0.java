class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder builder = new StringBuilder();
        for(Character s1 : s.toCharArray()){
            if(Character.isLetterOrDigit(s1)){
                builder.append(Character.toLowerCase(s1));
            }

        }
        System.out.println("After Builder : "+builder);

        String newstr = builder.toString();

        int start = 0 ;
        int end = newstr.length()-1;

        while( start < end ){
            if(newstr.charAt(start)!=newstr.charAt(end)){
                return false;
            }
            start++;
            end -- ;

        }



        return true;
    }
}
