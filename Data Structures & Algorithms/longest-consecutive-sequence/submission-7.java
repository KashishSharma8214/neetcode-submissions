class Solution {
    public int longestConsecutive(int[] nums) {

        HashSet<Integer> set = new HashSet<>();
       
        int max = 0 ;  

        for( int n : nums){
            set.add(n);
        }
        
        for( int value : set ){

            if(!set.contains(value-1)){
               int counter = 1; 

               while(set.contains(value+counter)){
                counter++;
               }
                 max = Math.max(counter,max);
        
            }
           
        }
        return max;
        
    }
}
