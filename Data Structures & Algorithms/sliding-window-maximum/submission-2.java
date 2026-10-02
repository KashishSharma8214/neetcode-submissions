class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {

        ArrayDeque<Integer> queue = new ArrayDeque<>();
        int[] result = new int[nums.length -k+1];
        int j = 0 ;

        for(int i = 0 ; i < k ;i++){
            while(!queue.isEmpty() && nums[queue.getLast()] <= nums[i]){
                queue.removeLast();
            }
            queue.addLast(i);
        }
        // REMOVE ELEMENT WHICH IS NOT PART OF CURRENT WINDOW
       for( int i = k ; i < nums.length ; i++){

        result[j++] = nums[queue.peekFirst()];

        while(!queue.isEmpty() && queue.peekFirst() <= i - k){
            queue.pollFirst();
        }
        while (!queue.isEmpty() && nums[queue.peekLast()] <= nums[i]) {
                queue.pollLast();
            }
            
            queue.addLast(i);




       }
       result[j++] = nums[queue.peekFirst()];
        
        return result;
    }
}
