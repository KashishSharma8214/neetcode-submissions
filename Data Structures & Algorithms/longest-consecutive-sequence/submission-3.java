class Solution {
    public int longestConsecutive(int[] nums) {

        Set<Integer> set = new HashSet<>();

        for( int num : nums){
            set.add(num);
            
        }
        int res = 0 ; 
        for( int i : nums){
            if(!set.contains(i-1)){
                int counter = 1 ; 
                int current = i ;
           
            while(set.contains(current+1)){
                counter++;
                current++;
               
            }
            res = Math.max(counter,res);

            }
        }
        return res;
    }
}
