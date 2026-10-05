class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {

        ArrayDeque<Integer> dq = new ArrayDeque<>();

        int[] res = new int[nums.length - k+1];
        int j = 0 ;
        for( int i = 0 ; i < k ; i++){
            while(!dq.isEmpty() && nums[dq.getLast()] <= nums[i]){
                dq.pollLast();
            }
            dq.addLast(i);
            
      }
        
        for(int i = k ; i < nums.length ; i++){

            res[j++] = nums[dq.peekFirst()];

            // remove the index which is not part of current window 

            while (!dq.isEmpty() && dq.peekFirst() <= i - k ){
                dq.pollFirst();
            }

            while(!dq.isEmpty() && nums[dq.peekLast()] <=nums[i]){
                dq.pollLast();
            }

            dq.addLast(i);
            
        
        }

        res[j++] = nums[dq.peekFirst()];
        return res;


// CHECK IN oNE NOTES MY OWN SOLUTION 



        
    }
    
}
