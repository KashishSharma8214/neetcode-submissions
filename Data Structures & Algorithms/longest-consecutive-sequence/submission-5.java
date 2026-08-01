class Solution {
    public int longestConsecutive(int[] nums) {

        Set<Integer> list = new HashSet<>();
        for( int n : nums ){
            list.add(n);
        }
        System.out.println("List : "+ list);

        int res= 0 ;
        for(int i : nums){
            if(!list.contains(i-1)){
                int counter=1;
                int current=i;
            
            while(list.contains(current+1)){
                counter++;
                current++;
            }
            res = Math.max(counter,res);
            }
           
     
        }

   return res;
        
    }
    
}
